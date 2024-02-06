package com.verich.padel.common.jpa.mapper;

public interface MkJpaMapper<D, E> {

  D mapFrom(E object);

  E mapTo(D object);

}
