package com.verich.padel.api.infrastructure.jpa.mapper;

import java.util.Objects;
import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Player;
import com.verich.padel.api.infrastructure.jpa.entity.UserEntity;
import com.verich.padel.common.jpa.mapper.MkJpaMapper;
import com.verich.padel.common.type.enumeration.Level;

@Component
public class PlayerMapper implements MkJpaMapper<Player, UserEntity> {

  @Override
  public Player mapFrom(final UserEntity userEntity) {
    final Player player = new Player();
    player.setNickname(userEntity.getNickname());
    player.setName(userEntity.getName());
    player.setLastname(userEntity.getLastname());
    player.setPhone(userEntity.getPhone());
    player.setDniNie(userEntity.getDniNie());

    if (Objects.nonNull(userEntity.getLevel())) {
      player.setLevel(Level.getLevel(userEntity.getLevel()));
    }

    return player;
  }

  @Override
  public UserEntity mapTo(final Player Player) {
    final UserEntity userEntity = new UserEntity();
    userEntity.setNickname(Player.getNickname());
    userEntity.setName(Player.getName());
    userEntity.setLastname(Player.getLastname());
    userEntity.setPhone(Player.getPhone());
    userEntity.setDniNie(Player.getDniNie());

    if (Objects.nonNull(Player.getLevel())) {
      userEntity.setLevel(Player.getLevel().value());
    }

    return userEntity;
  }

}
