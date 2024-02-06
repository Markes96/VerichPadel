package com.verich.padel.infrastructure.jpa.user.entity;

import java.math.BigInteger;
import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "USERS")
public class UserEntity {

  @Id
  private String nickName;
  private String email;
  private String password;

  private String name;
  private String lastname;
  private Date birthdate;
  private BigInteger phone;
  private String dniNie;

  @Enumerated(EnumType.STRING)
  private GenderEnum gender;
  @Enumerated(EnumType.STRING)
  private LevelEnum level;

}
