package com.verich.padel.api.domain.service;

import java.util.List;
import com.verich.padel.api.domain.model.Location;

public interface LocationService {

  public Location get(final Long id);

  public Location get(final String name);

  public List<Location> getAll();

  public void add(final Location location);

  public void update(final Location location);

  public void delete(final Long id);

  public void delete(final String name);

}
