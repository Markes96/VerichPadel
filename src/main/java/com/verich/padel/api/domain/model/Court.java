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
public class Court extends MkDomainObject {

  private Long id;

  private String name;
  private Location location;

  public Court(final Long id) {
    this.id = id;
  }

}
