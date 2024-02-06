package com.verich.padel.api.domain.service;

import com.verich.padel.api.domain.model.User;

public interface UserService {

  User getByNickName(String nickname, String password);

  User getByEmail(String email, String password);

  void create(User userData, String password);

  void updateData(User userdata, String password);

  void updatePassword(String nickname, String password, String newPassword);

  void delete(String nickname, String password);

}
