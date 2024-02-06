package com.verich.padel.api.infrastructure.http.location.find.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.domain.service.LocationService;
import com.verich.padel.api.infrastructure.http.location.LocationController;
import com.verich.padel.api.infrastructure.http.location.find.dto.LocationFindResponseDTO;
import com.verich.padel.api.infrastructure.http.location.find.mapper.LocationFindMapper;

@RestController
@RequestMapping("/location/find")
public class LocationFindController extends LocationController {

  @Autowired
  private LocationService service;

  @Autowired
  private LocationFindMapper mapper;

  @GetMapping("/byId/{id}")
  public ResponseEntity<LocationFindResponseDTO> findById(
      @PathVariable final Long id) {
    final Location location = service.get(id);
    return ResponseEntity.ok(mapper.mapToResponse(location));
  }

  @GetMapping("/byName/{name}")
  public ResponseEntity<LocationFindResponseDTO> findByName(
      @PathVariable final String name) {
    final Location location = service.get(name);
    return ResponseEntity.ok(mapper.mapToResponse(location));
  }

  @GetMapping("/all")
  public ResponseEntity<List<LocationFindResponseDTO>> findAll() {
    final List<LocationFindResponseDTO> response =
        service.getAll().stream().map(mapper::mapToResponse).toList();
    return ResponseEntity.ok(response);
  }

}
