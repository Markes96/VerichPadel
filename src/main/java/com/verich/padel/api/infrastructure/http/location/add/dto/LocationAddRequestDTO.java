package com.verich.padel.api.infrastructure.http.location.add.dto;

import com.verich.padel.common.http.type.MkHttpRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationAddRequestDTO extends MkHttpRequestDTO {

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
