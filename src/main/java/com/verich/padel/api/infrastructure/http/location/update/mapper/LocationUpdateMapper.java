package com.verich.padel.api.infrastructure.http.location.update.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.infrastructure.http.location.update.dto.LocationUpdateRequestDTO;
import com.verich.padel.common.http.mapper.req.MkHttpAbstractMapper;

@Component
public class LocationUpdateMapper
    extends MkHttpAbstractMapper<LocationUpdateRequestDTO, Location> {}
