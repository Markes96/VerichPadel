package com.verich.padel.common.domain.port;

import java.util.List;
import com.verich.padel.common.domain.type.MkDomainObject;

public interface MkDomainReaderPort<D extends MkDomainObject> {

  long count();

  long count(final D filter);

  boolean exist(final D filter);

  D findOne(final D filter);

  List<D> findAll();

  List<D> findAll(final D filter);

}
