package com.verich.padel.api.infrastructure.http.user.update.password.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.service.UserService;
import com.verich.padel.api.infrastructure.http.user.UserController;
import com.verich.padel.api.infrastructure.http.user.update.password.dto.UserUpdatePasswordRequestDTO;

@RestController
@RequestMapping("/user/update/password")
public class UserUpdatePasswordController extends UserController {

  @Autowired
  private UserService service;

  @PostMapping
  public ResponseEntity<Void> updatePassword(
      @RequestBody final UserUpdatePasswordRequestDTO body) {
    service.updatePassword(body.getNickname(), body.getPassword(), body.getNewPassword());
    return ResponseEntity.ok().build();
  }

}
