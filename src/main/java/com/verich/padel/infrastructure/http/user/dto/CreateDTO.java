package com.verich.padel.infrastructure.http.user.dto;

import java.util.Date;
import com.markes96.dto.AbstractDTO;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CreateDTO extends AbstractDTO {

  private String name;
  private String lastName;
  private String nickName;

  private String password;

  private String dni;
  private boolean registered;

  private Date birthdate;

  private SexEnum sex;
  private LevelEnum level;

}
