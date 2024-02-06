package com.verich.padel.api.infrastructure.http.location.add.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.service.LocationService;
import com.verich.padel.api.infrastructure.http.location.LocationController;
import com.verich.padel.api.infrastructure.http.location.add.dto.LocationAddRequestDTO;
import com.verich.padel.api.infrastructure.http.location.add.mapper.LocationAddMapper;
import com.verich.padel.api.infrastructure.http.location.find.dto.LocationFindResponseDTO;

@RestController
@RequestMapping("/location/add")
public class LocationAddController extends LocationController {

  @Autowired
  private LocationService service;

  @Autowired
  private LocationAddMapper mapper;

  @PutMapping
  public ResponseEntity<LocationFindResponseDTO> add(
      @RequestBody final LocationAddRequestDTO request) {
    service.add(mapper.mapFromRequest(request));
    return ResponseEntity.ok().build();
  }

}
