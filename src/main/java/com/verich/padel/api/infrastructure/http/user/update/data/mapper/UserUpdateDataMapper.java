package com.verich.padel.api.infrastructure.http.user.update.data.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.infrastructure.http.user.update.data.dto.UserUpdateDataRequestDTO;

@Component
public class UserUpdateDataMapper {

  public User mapRequest(final UserUpdateDataRequestDTO request) {

    final User user = new User();
    user.setNickname(request.getNickname());
    user.setName(request.getName());
    user.setLastname(request.getLastname());
    user.setBirthdate(request.getBirthdate());
    user.setPhone(request.getPhone());
    user.setDniNie(request.getDniNie());
    user.setGender(request.getGender());
    return user;

  }

}
