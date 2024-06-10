package com.verich.padel.common.domain.port;

import java.util.List;
import com.verich.padel.common.domain.type.MkDomainObject;

public interface MkDomainWriterPort<D extends MkDomainObject>
    extends MkDomainReaderPort<D> {

  void add(D persisToAdd);

  void addAll(List<D> persisToAdd);

  void update(D persisToUpdate);

  void updateAll(List<D> persisToUpdate);

  void addOrUpdate(D persisToUpdate);

  void addOrUpdateAll(List<D> persisToUpdate);

  void delete(D persisToDelete);

  void deleteAll(List<D> persisToDelete);

}
