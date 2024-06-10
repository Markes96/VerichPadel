package com.verich.padel.api.infrastructure.jpa.entity;

import java.sql.Date;
import com.verich.padel.common.jpa.type.MkJpaEntity;
import com.verich.padel.common.type.enumeration.Gender;
import jakarta.persistence.Column;
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
public class UserEntity extends MkJpaEntity {

  @Id
  @Column(length = 20)
  private String nickname;

  @Column(length = 50, nullable = false, unique = true)
  private String email;

  @Column(nullable = false, unique = true)
  private byte[] hash;

  @Column(length = 50, nullable = false)
  private String salt;

  @Column(length = 20, nullable = false)
  private String name;

  @Column(length = 20, nullable = false)
  private String lastname;

  @Column(nullable = false)
  private Date birthdate;

  @Column(length = 20, nullable = false, unique = true)
  private String phone;

  @Column(length = 15, nullable = false, unique = true)
  private String dniNie;

  @Column(length = 20, nullable = false)
  @Enumerated(EnumType.STRING)
  private Gender gender;

  @Column(nullable = false)
  private Integer level;

}
