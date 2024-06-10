package com.verich.padel.common.http.mapper.res;

import com.verich.padel.common.domain.type.MkDomainObject;
import com.verich.padel.common.http.type.MkHttpResponseDTO;
import com.verich.padel.common.http.type.request.MkHttpVoidRequestDTO;

public class MkHttpAbstractMapper<Dom extends MkDomainObject, Res extends MkHttpResponseDTO>
    extends
    com.verich.padel.common.http.mapper.reqres.MkHttpAbstractMapper<MkHttpVoidRequestDTO, Dom, Res> {}
