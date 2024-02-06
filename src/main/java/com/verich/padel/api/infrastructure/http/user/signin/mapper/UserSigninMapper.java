package com.verich.padel.api.infrastructure.http.user.signin.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.infrastructure.http.user.signin.dto.UserSigninRequestDTO;

@Component
public class UserSigninMapper {

  public User mapFromRequest(final UserSigninRequestDTO request) {

    final User user = new User();
    user.setNickname(request.getNickname());
    user.setEmail(request.getEmail());
    user.setName(request.getName());
    user.setLastname(request.getLastname());
    user.setBirthdate(request.getBirthdate());
    user.setPhone(request.getPhone());
    user.setDniNie(request.getDniNie());
    user.setGender(request.getGender());
    user.setLevel(request.getLevel());
    return user;

  }

}
