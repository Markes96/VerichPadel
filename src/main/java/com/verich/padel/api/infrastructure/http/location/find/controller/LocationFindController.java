package com.verich.padel.api.infrastructure.http.location.find.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.domain.service.LocationService;
import com.verich.padel.api.infrastructure.http.location.LocationController;
import com.verich.padel.api.infrastructure.http.location.find.dto.LocationFindResponseDTO;
import com.verich.padel.common.http.controller.res.MkHttpController;

@RestController
@RequestMapping("/location/find")
public class LocationFindController
    extends MkHttpController<LocationService, Location, LocationFindResponseDTO>
    implements LocationController {

  @GetMapping("/byId/{id}")
  public ResponseEntity<LocationFindResponseDTO> findById(
      @PathVariable final Long id) {
    final Location location = service.get(id);
    return ResponseEntity.ok(mapper.mapDom2Res(location));
  }

  @GetMapping("/byName/{name}")
  public ResponseEntity<LocationFindResponseDTO> findByName(
      @PathVariable final String name) {
    final Location location = service.get(name);
    return ResponseEntity.ok(mapper.mapDom2Res(location));
  }

  @GetMapping("/all")
  public ResponseEntity<List<LocationFindResponseDTO>> findAll() {
    final List<LocationFindResponseDTO> response =
        service.getAll().stream().map(mapper::mapDom2Res).toList();
    return ResponseEntity.ok(response);
  }

}
