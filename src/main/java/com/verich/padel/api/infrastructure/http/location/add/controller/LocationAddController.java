package com.verich.padel.api.infrastructure.http.location.add.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.domain.service.LocationService;
import com.verich.padel.api.infrastructure.http.location.LocationController;
import com.verich.padel.api.infrastructure.http.location.add.dto.LocationAddRequestDTO;
import com.verich.padel.common.http.controller.req.MkHttpController;

@RestController
@RequestMapping("/location/add")
public class LocationAddController
    extends MkHttpController<LocationService, LocationAddRequestDTO, Location>
    implements LocationController {

  @PutMapping
  public ResponseEntity<Void> add(
      @RequestBody final LocationAddRequestDTO request) {
    service.add(mapper.mapReq2Dom(request));
    return ResponseEntity.ok().build();
  }

}
