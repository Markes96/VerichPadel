package com.verich.padel.api.infrastructure.http.user.update.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.service.UserService;
import com.verich.padel.api.infrastructure.http.user.UserController;
import com.verich.padel.api.infrastructure.http.user.update.data.dto.UserUpdateDataRequestDTO;
import com.verich.padel.api.infrastructure.http.user.update.data.mapper.UserUpdateDataMapper;

@RestController
@RequestMapping("/user/update/data")
public class UserUpdateDataController extends UserController {

  @Autowired
  private UserService service;

  @Autowired
  private UserUpdateDataMapper mapper;

  @PostMapping
  public ResponseEntity<Void> updateData(
      @RequestBody final UserUpdateDataRequestDTO body) {
    service.updateData(mapper.mapRequest(body), body.getPassword());
    return ResponseEntity.ok().build();
  }

}
