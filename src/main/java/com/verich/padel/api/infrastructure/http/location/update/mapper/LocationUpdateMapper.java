package com.verich.padel.api.infrastructure.http.location.update.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.infrastructure.http.location.update.dto.LocationUpdateRequestDTO;

@Component
public class LocationUpdateMapper {

  public Location mapFromRequest(final LocationUpdateRequestDTO response) {
    final Location location = new Location();
    location.setId(response.getId());
    location.setName(response.getName());
    location.setPostalCode(response.getPostalCode());
    location.setAddress(response.getAddress());
    location.setCity(response.getCity());
    location.setProvince(response.getProvince());
    location.setCountry(response.getCountry());
    return location;
  }

}
