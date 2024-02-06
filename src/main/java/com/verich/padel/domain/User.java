package com.verich.padel.domain;

import java.sql.Date;
import com.verich.padel.infrastructure.jpa.user.entity.LevelEnum;
import com.verich.padel.infrastructure.jpa.user.entity.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private String nickName;
  private String name;
  private String lastname;
  private String password;
  private String dni;
  private boolean registered;
  private Date birthdate;
  private GenderEnum sex;
  private LevelEnum level;

}
