package com.verich.padel.api.infrastructure.http.user.update.password.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdatePasswordRequestDTO {

  private String nickname;
  private String password;
  private String newPassword;

}
