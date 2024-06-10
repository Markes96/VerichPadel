package com.verich.padel.api.infrastructure.http.user.login.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.domain.service.UserService;
import com.verich.padel.api.infrastructure.http.user.UserController;
import com.verich.padel.api.infrastructure.http.user.login.dto.UserLoginRequestDTO;
import com.verich.padel.api.infrastructure.http.user.login.dto.UserLoginResponseDTO;
import com.verich.padel.common.http.controller.res.MkHttpController;

@RestController
@RequestMapping("/user/login")
public class UserLoginController
    extends MkHttpController<UserService, User, UserLoginResponseDTO>
    implements UserController {

  @PostMapping("/byNickname")
  public ResponseEntity<UserLoginResponseDTO> loginbyNickName(
      @RequestBody final UserLoginRequestDTO body) {
    final User response = service.getByNickName(body.getPublicKey(), body.getPrivateKey());
    return ResponseEntity.ok(mapper.mapDom2Res(response));
  }

  @PostMapping("/byEmail")
  public ResponseEntity<UserLoginResponseDTO> loginbyEmail(
      @RequestBody final UserLoginRequestDTO body) {
    final User response = service.getByEmail(body.getPublicKey(), body.getPrivateKey());
    return ResponseEntity.ok(mapper.mapDom2Res(response));
  }

}
