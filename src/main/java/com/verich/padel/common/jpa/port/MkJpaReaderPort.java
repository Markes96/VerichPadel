package com.verich.padel.common.jpa.port;

import java.util.List;
import com.verich.padel.common.jpa.type.MkJpaObject;

public interface MkJpaReaderPort<P extends MkJpaObject> {

  long count();

  long count(final P filter);

  boolean exist(final P filter);

  P findOne(final P filter);

  List<P> findAll();

  List<P> findAll(final P filter);

}
