package com.verich.padel.common.http.mapper.req;

import com.verich.padel.common.domain.type.MkDomainObject;
import com.verich.padel.common.http.type.MkHttpRequestDTO;
import com.verich.padel.common.http.type.response.MkHttpVoidResponseDTO;

public class MkHttpAbstractMapper<Req extends MkHttpRequestDTO, Dom extends MkDomainObject>
    extends
    com.verich.padel.common.http.mapper.reqres.MkHttpAbstractMapper<Req, Dom, MkHttpVoidResponseDTO> {}
