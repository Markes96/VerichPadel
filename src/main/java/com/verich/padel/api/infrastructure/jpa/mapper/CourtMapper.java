package com.verich.padel.api.infrastructure.jpa.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Court;
import com.verich.padel.api.infrastructure.jpa.entity.CourtEntity;
import com.verich.padel.common.jpa.mapper.MkJpaAbstractMapper;

@Component
public class CourtMapper extends MkJpaAbstractMapper<Court, CourtEntity> {}

