package com.verich.padel.api.infrastructure.http.user.delete.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.domain.service.UserService;
import com.verich.padel.api.infrastructure.http.user.UserController;
import com.verich.padel.api.infrastructure.http.user.delete.dto.UserDeleteRequestDTO;
import com.verich.padel.common.http.controller.MkHttpController;

@RestController
@RequestMapping("/user/delete")
public class UserDeleteController
    extends MkHttpController<UserService, User>
    implements UserController {

  @DeleteMapping
  public ResponseEntity<Void> delete(
      @RequestBody final UserDeleteRequestDTO body) {
    service.delete(body.getNickname(), body.getPassword());
    return ResponseEntity.ok().build();
  }

}
