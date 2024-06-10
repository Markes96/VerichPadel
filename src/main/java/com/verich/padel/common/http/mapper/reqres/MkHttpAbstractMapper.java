package com.verich.padel.common.http.mapper.reqres;

import java.util.function.Function;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.modelmapper.internal.typetools.TypeResolver;
import org.modelmapper.spi.DestinationSetter;
import org.modelmapper.spi.SourceGetter;
import com.verich.padel.common.domain.type.MkDomainObject;
import com.verich.padel.common.http.mapper.MkHttpMapper;
import com.verich.padel.common.http.type.MkHttpRequestDTO;
import com.verich.padel.common.http.type.MkHttpResponseDTO;
import com.verich.padel.common.utils.ModelMapperUtils;

public class MkHttpAbstractMapper<Req extends MkHttpRequestDTO, Dom extends MkDomainObject, Res extends MkHttpResponseDTO>
    implements MkHttpMapper<Req, Dom, Res> {

  private final Class<Req> reqType;
  private final Class<Dom> domType;
  private final Class<Res> resType;

  protected final TypeMap<Req, Dom> mapReq2Dom;
  protected final TypeMap<Dom, Res> mapDom2Res;

  @SuppressWarnings("unchecked")
  public MkHttpAbstractMapper() {

    final Class<?>[] rawArguments = TypeResolver
        .resolveRawArguments(MkHttpAbstractMapper.class, this.getClass());

    reqType = (Class<Req>) rawArguments[0];
    domType = (Class<Dom>) rawArguments[1];
    resType = (Class<Res>) rawArguments[2];

    final ModelMapper mapper = new ModelMapper();

    mapReq2Dom = mapper.createTypeMap(reqType, domType);
    mapDom2Res = mapper.createTypeMap(domType, resType);
  }

  @Override
  public Dom mapReq2Dom(final Req object) {
    return mapReq2Dom.map(object);
  }

  @Override
  public Res mapDom2Res(final Dom object) {
    return mapDom2Res.map(object);
  }

  @SuppressWarnings("unchecked")
  protected <ReqV, DomV> void addReq2DomMapper(final SourceGetter<Req> getter,
      final DestinationSetter<Dom, DomV> setter, final Function<ReqV, DomV> ReqV2DomV) {

    mapReq2Dom.addMappings(
        mapper -> mapper
            .when(ctx -> ctx.getSource() != null)
            .using(ctx -> ReqV2DomV.apply((ReqV) ctx.getSource()))
            .map(getter, setter));
  }

  @SuppressWarnings("unchecked")
  protected <DomV, ResV> void addDom2ResMapper(final SourceGetter<Dom> getter,
      final DestinationSetter<Res, ResV> setter, final Function<DomV, ResV> DomV2ResV) {

    mapDom2Res.addMappings(
        mapper -> mapper
            .when(ctx -> ctx.getSource() != null)
            .using(ctx -> DomV2ResV.apply((DomV) ctx.getSource()))
            .map(getter, setter));

  }

  protected <ReqV, DomV> void addReq2DomMapper(final String field,
      final Function<ReqV, DomV> ReqV2DomV) {
    final SourceGetter<Req> dGetter = ModelMapperUtils.findGetter(field, reqType);
    final DestinationSetter<Dom, DomV> eSetter = ModelMapperUtils.findSetter(field, domType);

    this.addReq2DomMapper(dGetter, eSetter, ReqV2DomV);
  }

  protected <DomV, ResV> void addDom2ResMapper(final String field,
      final Function<DomV, ResV> DomV2ResV) {
    final SourceGetter<Dom> eGetter = ModelMapperUtils.findGetter(field, domType);
    final DestinationSetter<Res, ResV> dSetter = ModelMapperUtils.findSetter(field, resType);

    this.addDom2ResMapper(eGetter, dSetter, DomV2ResV);
  }

  protected <ReqV, DomV, ResV> void addMapper(final String field,
      final Function<ReqV, DomV> ReqV2DomV,
      final Function<DomV, ResV> DomV2ResV) {
    this.addReq2DomMapper(field, ReqV2DomV);
    this.addDom2ResMapper(field, DomV2ResV);
  }

  protected <ReqP extends MkHttpRequestDTO, DomP extends MkDomainObject, ResP extends MkHttpResponseDTO> void addMapper(
      final String field, final MkHttpMapper<ReqP, DomP, ResP> mapper) {
    this.addMapper(field, mapper::mapReq2Dom, mapper::mapDom2Res);
  }

}
