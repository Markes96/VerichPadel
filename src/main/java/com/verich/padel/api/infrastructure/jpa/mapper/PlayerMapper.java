package com.verich.padel.api.infrastructure.jpa.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Player;
import com.verich.padel.api.infrastructure.jpa.entity.UserEntity;
import com.verich.padel.common.jpa.mapper.MkJpaAbstractMapper;

@Component
public class PlayerMapper extends MkJpaAbstractMapper<Player, UserEntity> {}
