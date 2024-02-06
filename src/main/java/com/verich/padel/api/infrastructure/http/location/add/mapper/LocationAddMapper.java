package com.verich.padel.api.infrastructure.http.location.add.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.infrastructure.http.location.add.dto.LocationAddRequestDTO;

@Component
public class LocationAddMapper {

  public Location mapFromRequest(final LocationAddRequestDTO response) {
    final Location location = new Location();
    location.setName(response.getName());
    location.setPostalCode(response.getPostalCode());
    location.setAddress(response.getAddress());
    location.setCity(response.getCity());
    location.setProvince(response.getProvince());
    location.setCountry(response.getCountry());
    return location;
  }

}
