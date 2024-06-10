package com.verich.padel.api.infrastructure.http.user.login.dto;

import java.sql.Date;
import com.verich.padel.common.http.type.MkHttpResponseDTO;
import com.verich.padel.common.type.enumeration.Gender;
import com.verich.padel.common.type.enumeration.Level;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginResponseDTO extends MkHttpResponseDTO {

  private String nickName;
  private String email;

  private String name;
  private String lastname;
  private Date birthdate;
  private String phone;
  private String dniNie;

  private Gender gender;
  private Level level;

}
