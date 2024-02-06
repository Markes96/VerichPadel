package com.verich.padel.common.jpa.port;

import java.util.List;
import com.verich.padel.common.jpa.type.MkJpaObject;

public interface MkJpaWriterPort<P extends MkJpaObject>
    extends MkJpaReaderPort<P> {

  void add(P persisToAdd);

  void addAll(List<P> persisToAdd);

  void update(P persisToUpdate);

  void updateAll(List<P> persisToUpdate);

  void addOrUpdate(P persisToUpdate);

  void addOrUpdateAll(List<P> persisToUpdate);

  void delete(P persisToDelete);

  void deleteAll(List<P> persisToDelete);

}
