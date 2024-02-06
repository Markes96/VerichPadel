package com.verich.padel.api.infrastructure.http.location.find.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.infrastructure.http.location.find.dto.LocationFindResponseDTO;

@Component
public class LocationFindMapper {

  public LocationFindResponseDTO mapToResponse(final Location location) {
    final LocationFindResponseDTO dto = new LocationFindResponseDTO();
    dto.setId(location.getId());
    dto.setName(location.getName());
    dto.setPostalCode(location.getPostalCode());
    dto.setAddress(location.getAddress());
    dto.setCity(location.getCity());
    dto.setProvince(location.getProvince());
    dto.setCountry(location.getCountry());
    return dto;
  }

}
