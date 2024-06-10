package com.verich.padel.common.http.controller.reqres;

import org.springframework.beans.factory.annotation.Autowired;
import com.verich.padel.common.domain.type.MkDomainObject;
import com.verich.padel.common.http.mapper.MkHttpMapper;
import com.verich.padel.common.http.type.MkHttpRequestDTO;
import com.verich.padel.common.http.type.MkHttpResponseDTO;

public abstract class MkHttpController<Service, req extends MkHttpRequestDTO, Dom extends MkDomainObject, Res extends MkHttpResponseDTO>
    extends com.verich.padel.common.http.controller.MkHttpController<Service, Dom> {

  @Autowired
  protected MkHttpMapper<req, Dom, Res> mapper;

}
