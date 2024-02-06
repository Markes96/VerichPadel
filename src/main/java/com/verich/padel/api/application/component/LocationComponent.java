package com.verich.padel.api.application.component;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.common.jpa.port.MkJpaWriterPort;

@Component
public class LocationComponent {

  @Autowired
  MkJpaWriterPort<Location> LocationWriter;

  private static final String LOCATION_DONT_EXIST = "Error, location do not exist -> ";
  private static final String ID = "id: ";
  private static final String NAME = "name: ";

  public Location getById(final Long id) {
    final Location filter = new Location(id);
    final Location location = LocationWriter.findOne(filter);
    if (Objects.isNull(location))
      throw new RuntimeException(LOCATION_DONT_EXIST + ID + id);
    return location;
  }

  public Location getByName(final String name) {
    final Location filter = new Location(name);
    final Location location = LocationWriter.findOne(filter);
    if (Objects.isNull(location))
      throw new RuntimeException(LOCATION_DONT_EXIST + NAME + name);
    return location;
  }

  public List<Location> getAll() {
    return LocationWriter.findAll();
  }

  public void add(final Location location) {
    LocationWriter.add(location);
  }

  public void update(final Location location) {
    LocationWriter.update(location);
  }

  public void deleteById(final Long id) {
    final Location filter = new Location(id);
    LocationWriter.delete(filter);
  }

  public void deleteByName(final String name) {
    final Location filter = new Location(name);
    LocationWriter.delete(filter);
  }
}
