package com.verich.padel.api.infrastructure.http.user.signin.mapper;

import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.infrastructure.http.user.signin.dto.UserSigninRequestDTO;
import com.verich.padel.common.http.mapper.req.MkHttpAbstractMapper;

@Component
public class UserSigninMapper extends MkHttpAbstractMapper<UserSigninRequestDTO, User> {}
