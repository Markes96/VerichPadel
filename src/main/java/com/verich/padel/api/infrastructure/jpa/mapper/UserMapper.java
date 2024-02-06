package com.verich.padel.api.infrastructure.jpa.mapper;

import java.util.Objects;
import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.infrastructure.jpa.entity.UserEntity;
import com.verich.padel.common.jpa.mapper.MkJpaMapper;
import com.verich.padel.common.type.enumeration.Level;

@Component
public class UserMapper implements MkJpaMapper<User, UserEntity> {

  @Override
  public User mapFrom(final UserEntity userEntity) {
    final User user = new User();
    user.setNickname(userEntity.getNickname());
    user.setEmail(userEntity.getEmail());
    user.setSalt(userEntity.getSalt());
    user.setName(userEntity.getName());
    user.setLastname(userEntity.getLastname());
    user.setBirthdate(userEntity.getBirthdate());
    user.setPhone(userEntity.getPhone());
    user.setDniNie(userEntity.getDniNie());
    user.setGender(userEntity.getGender());

    if (Objects.nonNull(userEntity.getHash())) {
      user.setHash(new String(userEntity.getHash()));
    }

    if (Objects.nonNull(userEntity.getLevel())) {
      user.setLevel(Level.getLevel(userEntity.getLevel()));
    }

    return user;
  }

  @Override
  public UserEntity mapTo(final User user) {
    final UserEntity userEntity = new UserEntity();
    userEntity.setNickname(user.getNickname());
    userEntity.setEmail(user.getEmail());
    userEntity.setSalt(user.getSalt());
    userEntity.setName(user.getName());
    userEntity.setLastname(user.getLastname());
    userEntity.setBirthdate(user.getBirthdate());
    userEntity.setPhone(user.getPhone());
    userEntity.setDniNie(user.getDniNie());
    userEntity.setGender(user.getGender());

    if (Objects.nonNull(user.getHash())) {
      userEntity.setHash(user.getHash().getBytes());
    }

    if (Objects.nonNull(user.getLevel())) {
      userEntity.setLevel(user.getLevel().value());
    }

    return userEntity;
  }

}
