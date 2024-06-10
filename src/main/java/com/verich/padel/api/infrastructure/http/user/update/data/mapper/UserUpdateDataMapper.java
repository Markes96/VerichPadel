package com.verich.padel.api.infrastructure.http.user.update.data.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.infrastructure.http.user.update.data.dto.UserUpdateDataRequestDTO;
import com.verich.padel.common.http.mapper.req.MkHttpAbstractMapper;

@Component
public class UserUpdateDataMapper extends MkHttpAbstractMapper<UserUpdateDataRequestDTO, User> {}
