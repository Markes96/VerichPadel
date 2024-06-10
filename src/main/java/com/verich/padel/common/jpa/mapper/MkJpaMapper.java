package com.verich.padel.common.jpa.mapper;

import com.verich.padel.common.domain.type.MkDomainObject;
import com.verich.padel.common.jpa.type.MkJpaEntity;

public interface MkJpaMapper<D extends MkDomainObject, E extends MkJpaEntity> {

  E mapD2E(D object);

  D mapE2D(final E object);

}
