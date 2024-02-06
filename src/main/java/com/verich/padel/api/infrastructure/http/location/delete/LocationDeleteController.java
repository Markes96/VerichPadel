package com.verich.padel.api.infrastructure.http.location.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.service.LocationService;
import com.verich.padel.api.infrastructure.http.location.LocationController;

@RestController
@RequestMapping("/location/delete")
public class LocationDeleteController extends LocationController {

  @Autowired
  private LocationService service;

  @DeleteMapping("/byId/{id}")
  public ResponseEntity<Void> deleteById(
      @PathVariable final Long id) {
    service.delete(id);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping("/byName/{name}")
  public ResponseEntity<Void> deleteByName(
      @PathVariable final String name) {
    service.delete(name);
    return ResponseEntity.ok().build();
  }

}
