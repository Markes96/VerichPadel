package com.verich.padel.api.infrastructure.jpa.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.infrastructure.jpa.entity.LocationEntity;
import com.verich.padel.common.jpa.mapper.MkJpaAbstractMapper;

@Component
public class LocationMapper extends MkJpaAbstractMapper<Location, LocationEntity> {}

