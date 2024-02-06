package com.verich.padel.api.infrastructure.http.location.update.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.service.LocationService;
import com.verich.padel.api.infrastructure.http.location.LocationController;
import com.verich.padel.api.infrastructure.http.location.find.dto.LocationFindResponseDTO;
import com.verich.padel.api.infrastructure.http.location.update.dto.LocationUpdateRequestDTO;
import com.verich.padel.api.infrastructure.http.location.update.mapper.LocationUpdateMapper;

@RestController
@RequestMapping("/location/update")
public class LocationUpdateController extends LocationController {

  @Autowired
  private LocationService service;

  @Autowired
  private LocationUpdateMapper mapper;

  @PostMapping
  public ResponseEntity<LocationFindResponseDTO> update(
      @RequestBody final LocationUpdateRequestDTO request) {
    service.update(mapper.mapFromRequest(request));
    return ResponseEntity.ok().build();
  }

}
