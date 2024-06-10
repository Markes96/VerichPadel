package com.verich.padel.common.http.controller.res;

import org.springframework.beans.factory.annotation.Autowired;
import com.verich.padel.common.domain.type.MkDomainObject;
import com.verich.padel.common.http.mapper.MkHttpMapper;
import com.verich.padel.common.http.type.MkHttpResponseDTO;
import com.verich.padel.common.http.type.request.MkHttpVoidRequestDTO;

public abstract class MkHttpController<Service, Dom extends MkDomainObject, Res extends MkHttpResponseDTO>
    extends com.verich.padel.common.http.controller.MkHttpController<Service, Dom> {

  @Autowired
  protected MkHttpMapper<MkHttpVoidRequestDTO, Dom, Res> mapper;

}
