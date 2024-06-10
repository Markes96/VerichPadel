package com.verich.padel.common.http.mapper;

import com.verich.padel.common.domain.type.MkDomainObject;
import com.verich.padel.common.http.type.MkHttpRequestDTO;
import com.verich.padel.common.http.type.MkHttpResponseDTO;

public interface MkHttpMapper<Req extends MkHttpRequestDTO, Dom extends MkDomainObject, Res extends MkHttpResponseDTO> {

  Dom mapReq2Dom(final Req object);

  Res mapDom2Res(Dom object);

}
