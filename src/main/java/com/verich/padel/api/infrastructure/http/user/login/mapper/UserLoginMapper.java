package com.verich.padel.api.infrastructure.http.user.login.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.infrastructure.http.user.login.dto.UserLoginResponseDTO;
import com.verich.padel.common.http.mapper.res.MkHttpAbstractMapper;

@Component
public class UserLoginMapper extends MkHttpAbstractMapper<User, UserLoginResponseDTO> {}
