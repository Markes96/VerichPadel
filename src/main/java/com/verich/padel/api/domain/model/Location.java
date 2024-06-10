package com.verich.padel.api.domain.model;

import com.verich.padel.common.domain.type.MkDomainObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location extends MkDomainObject {

  private Long id;
  private String name;

  private String postalCode;
  private String address;
  private String city;
  private String province;
  private String country;

  public Location(final Long id) {
    this.id = id;
  }

  public Location(final String name) {
    this.name = name;
  }

}

