package com.verich.padel.api.domain.model;

import com.verich.padel.common.jpa.type.MkJpaObject;
import com.verich.padel.common.type.enumeration.Level;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player extends MkJpaObject {

  @NonNull
  private String nickname;

  private String name;
  private String lastname;

  private String phone;
  private String dniNie;

  private Level level;

}
