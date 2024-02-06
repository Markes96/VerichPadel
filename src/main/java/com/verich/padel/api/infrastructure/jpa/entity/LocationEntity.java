package com.verich.padel.api.infrastructure.jpa.entity;

import com.verich.padel.common.jpa.type.MkJpaEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "locations")
public class LocationEntity extends MkJpaEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 50, nullable = false, unique = true)
  private String name;

  @Column(length = 20, nullable = false)
  private String postalCode;

  @Column(length = 100, nullable = false)
  private String address;

  @Column(length = 50, nullable = false)
  private String city;

  @Column(length = 50, nullable = false)
  private String province;

  @Column(length = 50, nullable = false)
  private String country;

}

