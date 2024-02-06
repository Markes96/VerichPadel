package com.verich.padel.infrastructure.http.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.infrastructure.http.server.cdo.AllOKServerStatusCDO;

@RestController
@RequestMapping("/server")
public class ServerController {

  @Autowired
  private AllOKServerStatusCDO serverStatusCDO;

  @GetMapping("/status")
  public ResponseEntity<AllOKServerStatusCDO> getStatus() {
    return ResponseEntity.ok(this.serverStatusCDO);
  }


}
