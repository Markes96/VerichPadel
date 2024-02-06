package com.verich.padel.api.infrastructure.http.user.login.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.infrastructure.http.user.login.dto.UserLoginResponseDTO;

@Component
public class UserLoginMapper {

  public UserLoginResponseDTO mapToResponse(final User user) {
    final UserLoginResponseDTO dto = new UserLoginResponseDTO();
    dto.setNickName(user.getNickname());
    dto.setEmail(user.getEmail());
    dto.setName(user.getName());
    dto.setLastname(user.getLastname());
    dto.setBirthdate(user.getBirthdate());
    dto.setPhone(user.getPhone());
    dto.setDniNie(user.getDniNie());
    dto.setGender(user.getGender());
    dto.setLevel(user.getLevel());
    return dto;
  }

}
