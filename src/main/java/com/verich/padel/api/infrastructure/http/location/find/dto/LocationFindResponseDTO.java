package com.verich.padel.api.infrastructure.http.location.find.dto;

import com.verich.padel.common.http.type.MkHttpResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationFindResponseDTO extends MkHttpResponseDTO {

  private Long id;

  private String name;

  private String postalCode;
  private String address;
  private String city;
  private String province;
  private String country;

}
