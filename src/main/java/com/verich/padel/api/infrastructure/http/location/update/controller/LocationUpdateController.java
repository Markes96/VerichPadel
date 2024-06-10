package com.verich.padel.api.infrastructure.http.location.update.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.domain.service.LocationService;
import com.verich.padel.api.infrastructure.http.location.LocationController;
import com.verich.padel.api.infrastructure.http.location.update.dto.LocationUpdateRequestDTO;
import com.verich.padel.common.http.controller.req.MkHttpController;

@RestController
@RequestMapping("/location/update")
public class LocationUpdateController
    extends MkHttpController<LocationService, LocationUpdateRequestDTO, Location>
    implements LocationController {

  @PostMapping
  public ResponseEntity<Void> update(
      @RequestBody final LocationUpdateRequestDTO request) {
    service.update(mapper.mapReq2Dom(request));
    return ResponseEntity.ok().build();
  }

}
