package com.verich.padel.api.infrastructure.jpa.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.infrastructure.jpa.entity.UserEntity;
import com.verich.padel.common.jpa.mapper.MkJpaAbstractMapper;
import com.verich.padel.common.type.enumeration.Level;

@Component
public class UserMapper extends MkJpaAbstractMapper<User, UserEntity> {

  {
    this.<Level, Integer>addMapper("level", Level::getValue, Level::getLevel);
    this.<String, byte[]>addMapper("hash", String::getBytes, (bytes) -> new String(bytes));
  }

}
