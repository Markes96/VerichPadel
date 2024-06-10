package com.verich.padel.common.http.controller.req;

import org.springframework.beans.factory.annotation.Autowired;
import com.verich.padel.common.domain.type.MkDomainObject;
import com.verich.padel.common.http.mapper.MkHttpMapper;
import com.verich.padel.common.http.type.MkHttpRequestDTO;
import com.verich.padel.common.http.type.response.MkHttpVoidResponseDTO;

public abstract class MkHttpController<Service, Req extends MkHttpRequestDTO, Dom extends MkDomainObject>
    extends com.verich.padel.common.http.controller.MkHttpController<Service, Dom> {

  @Autowired
  protected MkHttpMapper<Req, Dom, MkHttpVoidResponseDTO> mapper;

}
