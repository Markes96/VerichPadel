package com.verich.padel.api.application;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verich.padel.api.application.component.LocationComponent;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.domain.service.LocationService;

@Service
public class LocationUseCase implements LocationService {

  @Autowired
  private LocationComponent LocationComp;

  @Override
  public Location get(final Long id) {
    return LocationComp.getById(id);
  }

  @Override
  public Location get(final String name) {
    return LocationComp.getByName(name);
  }

  @Override
  public List<Location> getAll() {
    return LocationComp.getAll();
  }

  @Override
  public void add(final Location location) {
    LocationComp.add(location);
  }

  @Override
  public void update(final Location location) {
    LocationComp.update(location);
  }

  @Override
  public void delete(final Long id) {
    LocationComp.deleteById(id);
  }

  @Override
  public void delete(final String name) {
    LocationComp.deleteByName(name);
  }

}
