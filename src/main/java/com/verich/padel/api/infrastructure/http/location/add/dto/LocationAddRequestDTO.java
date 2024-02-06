package com.verich.padel.api.infrastructure.http.location.add.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationAddRequestDTO {

  @NonNull
  private String name;
  @NonNull
  private String postalCode;
  @NonNull
  private String address;
  @NonNull
  private String city;
  @NonNull
  private String province;
  @NonNull
  private String country;

}
