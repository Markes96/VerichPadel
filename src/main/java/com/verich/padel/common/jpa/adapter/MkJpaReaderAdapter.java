package com.verich.padel.common.jpa.adapter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import com.verich.padel.common.domain.port.MkDomainReaderPort;
import com.verich.padel.common.domain.type.MkDomainObject;
import com.verich.padel.common.jpa.mapper.MkJpaMapper;
import com.verich.padel.common.jpa.type.MkJpaEntity;

public abstract class MkJpaReaderAdapter<D extends MkDomainObject, E extends MkJpaEntity, ID>
    implements MkDomainReaderPort<D> {

  @Autowired
  protected JpaRepository<E, ID> reposiroty;

  @Autowired
  protected MkJpaMapper<D, E> mapper;

  @Override
  public long count() {
    return reposiroty.count();
  }

  @Override
  public long count(final D filter) {
    final E example = mapper.mapD2E(filter);
    return reposiroty.count(Example.of(example));
  }

  @Override
  public boolean exist(final D filter) {
    final E example = mapper.mapD2E(filter);
    return reposiroty.exists(Example.of(example));
  }

  @Override
  public D findOne(final D filter) {
    final E example = mapper.mapD2E(filter);
    final Optional<E> result = reposiroty.findOne(Example.of(example));
    return result.isPresent() ? mapper.mapE2D(result.get()) : null;
  }

  @Override
  public List<D> findAll() {
    final List<E> result = reposiroty.findAll();
    return result.stream().map(mapper::mapE2D).collect(Collectors.toList());
  }

  @Override
  public List<D> findAll(final D filter) {
    final E example = mapper.mapD2E(filter);
    final List<E> result = reposiroty.findAll(Example.of(example));
    return result.stream().map(mapper::mapE2D).collect(Collectors.toList());
  }

}
