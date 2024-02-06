package com.verich.padel.api.infrastructure.http.user.update.data.dto;

import java.sql.Date;
import com.verich.padel.common.type.enumeration.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateDataRequestDTO {

  private String nickname;
  private String password;

  private String name;
  private String lastname;
  private Date birthdate;
  private String phone;
  private String dniNie;
  private Gender gender;
}
