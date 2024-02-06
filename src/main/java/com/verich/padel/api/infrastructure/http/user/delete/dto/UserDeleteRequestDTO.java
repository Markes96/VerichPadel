package com.verich.padel.api.infrastructure.http.user.delete.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDeleteRequestDTO {

  private String nickname;
  private String password;

}
