package com.verich.padel.api.infrastructure.http.location.find.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.infrastructure.http.location.find.dto.LocationFindResponseDTO;
import com.verich.padel.common.http.mapper.res.MkHttpAbstractMapper;

@Component
public class LocationFindMapper extends MkHttpAbstractMapper<Location, LocationFindResponseDTO> {}
