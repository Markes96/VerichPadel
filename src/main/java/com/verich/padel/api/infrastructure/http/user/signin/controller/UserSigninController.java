package com.verich.padel.api.infrastructure.http.user.signin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.domain.service.UserService;
import com.verich.padel.api.infrastructure.http.user.UserController;
import com.verich.padel.api.infrastructure.http.user.signin.dto.UserSigninRequestDTO;
import com.verich.padel.common.http.controller.req.MkHttpController;

@RestController
@RequestMapping("/user/signin")
public class UserSigninController
    extends MkHttpController<UserService, UserSigninRequestDTO, User>
    implements UserController {

  @PutMapping
  public ResponseEntity<Void> signin(
      @RequestBody final UserSigninRequestDTO body) {
    service.create(mapper.mapReq2Dom(body), body.getPassword());
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

}
