package com.verich.padel.api.infrastructure.jpa.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.infrastructure.jpa.entity.LocationEntity;
import com.verich.padel.common.jpa.mapper.MkJpaMapper;

@Component
public class LocationMapper implements MkJpaMapper<Location, LocationEntity> {

  @Override
  public Location mapFrom(final LocationEntity locationEntity) {
    final Location location = new Location();
    location.setId(locationEntity.getId());
    location.setName(locationEntity.getName());
    location.setPostalCode(locationEntity.getPostalCode());
    location.setAddress(locationEntity.getAddress());
    location.setCity(locationEntity.getCity());
    location.setProvince(locationEntity.getProvince());
    location.setCountry(locationEntity.getCountry());
    return location;
  }

  @Override
  public LocationEntity mapTo(final Location location) {
    final LocationEntity locationEntity = new LocationEntity();
    locationEntity.setId(location.getId());
    locationEntity.setName(location.getName());
    locationEntity.setPostalCode(location.getPostalCode());
    locationEntity.setAddress(location.getAddress());
    locationEntity.setCity(location.getCity());
    locationEntity.setProvince(location.getProvince());
    locationEntity.setCountry(location.getCountry());
    return locationEntity;
  }
}

