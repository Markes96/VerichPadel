package com.verich.padel.api.infrastructure.http.location.delete;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.domain.service.LocationService;
import com.verich.padel.api.infrastructure.http.location.LocationController;
import com.verich.padel.common.http.controller.MkHttpController;

@RestController
@RequestMapping("/location/delete")
public class LocationDeleteController
    extends MkHttpController<LocationService, Location>
    implements LocationController {

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
