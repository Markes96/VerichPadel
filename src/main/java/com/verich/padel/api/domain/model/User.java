package com.verich.padel.api.domain.model;

import java.sql.Date;
import com.verich.padel.common.jpa.type.MkJpaObject;
import com.verich.padel.common.type.enumeration.Gender;
import com.verich.padel.common.type.enumeration.Level;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User extends MkJpaObject {

  @NonNull
  private String nickname;
  private String email;

  private String hash;
  private String salt;

  private String name;
  private String lastname;
  private Date birthdate;
  private String phone;
  private String dniNie;

  private Gender gender;
  private Level level;

}
