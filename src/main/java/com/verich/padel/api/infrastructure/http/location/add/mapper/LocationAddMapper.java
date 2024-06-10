package com.verich.padel.api.infrastructure.http.location.add.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.infrastructure.http.location.add.dto.LocationAddRequestDTO;
import com.verich.padel.common.http.mapper.req.MkHttpAbstractMapper;

@Component
public class LocationAddMapper extends MkHttpAbstractMapper<LocationAddRequestDTO, Location> {}
