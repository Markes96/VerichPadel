package com.verich.padel.infrastructure.http.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verich.padel.infrastructure.http.user.dto.CreateDTO;
import com.verich.padel.infrastructure.jpa.user.UserRepository;
import com.verich.padel.infrastructure.jpa.user.entity.UserEntity;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserRepository repository;

  @GetMapping("/find/{nickName}")
  public ResponseEntity<UserEntity> findById(
      @PathVariable(required = true) final String nickName) {
    final UserEntity findById = this.repository.findById(nickName).orElse(null);
    return new ResponseEntity<>(findById, HttpStatus.OK);
  }

  @PostMapping("/create")
  public ResponseEntity<String> create(
      @RequestBody final CreateDTO createUserDto) {

    return new ResponseEntity<>("User created", HttpStatus.CREATED);
  }

}
