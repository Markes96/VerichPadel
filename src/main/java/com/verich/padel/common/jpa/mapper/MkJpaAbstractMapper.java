package com.verich.padel.common.jpa.mapper;

import java.util.function.Function;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.modelmapper.internal.typetools.TypeResolver;
import org.modelmapper.spi.DestinationSetter;
import org.modelmapper.spi.SourceGetter;
import com.verich.padel.common.domain.type.MkDomainObject;
import com.verich.padel.common.jpa.type.MkJpaEntity;
import com.verich.padel.common.utils.ModelMapperUtils;

public class MkJpaAbstractMapper<D extends MkDomainObject, E extends MkJpaEntity>
    implements MkJpaMapper<D, E> {

  private final Class<D> dType;
  private final Class<E> eType;

  protected final TypeMap<D, E> mapD2E;
  protected final TypeMap<E, D> mapE2D;

  @SuppressWarnings("unchecked")
  public MkJpaAbstractMapper() {

    final Class<?>[] rawArguments = TypeResolver
        .resolveRawArguments(MkJpaAbstractMapper.class, this.getClass());

    dType = (Class<D>) rawArguments[0];
    eType = (Class<E>) rawArguments[1];

    final ModelMapper mapper = new ModelMapper();

    mapD2E = mapper.createTypeMap(dType, eType);
    mapE2D = mapper.createTypeMap(eType, dType);
  }

  @Override
  public E mapD2E(final D object) {
    return mapD2E.map(object);
  }

  @Override
  public D mapE2D(final E object) {
    return mapE2D.map(object);
  }

  @SuppressWarnings("unchecked")
  protected <DV, EV> void addD2EMapper(final SourceGetter<D> getter,
      final DestinationSetter<E, EV> setter, final Function<DV, EV> DV2EV) {

    mapD2E.addMappings(
        mapper -> mapper
            .when(ctx -> ctx.getSource() != null)
            .using(ctx -> DV2EV.apply((DV) ctx.getSource()))
            .map(getter, setter));
  }

  @SuppressWarnings("unchecked")
  protected <EV, DV> void addE2DMapper(final SourceGetter<E> getter,
      final DestinationSetter<D, DV> setter, final Function<EV, DV> EV2DV) {

    mapE2D.addMappings(
        mapper -> mapper
            .when(ctx -> ctx.getSource() != null)
            .using(ctx -> EV2DV.apply((EV) ctx.getSource()))
            .map(getter, setter));

  }

  protected <EV, DV> void addD2EMapper(final String field, final Function<DV, EV> DV2EV) {
    final SourceGetter<D> dGetter = ModelMapperUtils.findGetter(field, dType);
    final DestinationSetter<E, EV> eSetter = ModelMapperUtils.findSetter(field, eType);

    this.addD2EMapper(dGetter, eSetter, DV2EV);
  }

  protected <EV, DV> void addE2DMapper(final String field, final Function<EV, DV> EV2DV) {
    final SourceGetter<E> eGetter = ModelMapperUtils.findGetter(field, eType);
    final DestinationSetter<D, DV> dSetter = ModelMapperUtils.findSetter(field, dType);

    this.addE2DMapper(eGetter, dSetter, EV2DV);
  }

  protected <DV, EV> void addMapper(final String field, final Function<DV, EV> DV2EV,
      final Function<EV, DV> EV2DV) {
    this.addD2EMapper(field, DV2EV);
    this.addE2DMapper(field, EV2DV);
  }

  protected <Dp extends MkDomainObject, Ep extends MkJpaEntity> void addMapper(final String field,
      final MkJpaMapper<Dp, Ep> mapper) {
    this.addMapper(field, mapper::mapD2E, mapper::mapE2D);
  }

}
