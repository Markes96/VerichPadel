package com.verich.padel.api.infrastructure.http.server.status.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.infrastructure.http.server.ServerController;
import com.verich.padel.api.infrastructure.http.server.status.cdo.AllOKServerStatusCDO;

@RestController
@RequestMapping("/server")
public class ServerStatusController implements ServerController {

  @Autowired
  private AllOKServerStatusCDO serverStatusCDO;

  @GetMapping("/status")
  public ResponseEntity<AllOKServerStatusCDO> getStatus() {
    return ResponseEntity.ok(serverStatusCDO);
  }

}
