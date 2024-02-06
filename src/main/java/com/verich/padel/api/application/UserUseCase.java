package com.verich.padel.api.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verich.padel.api.application.component.PasswordComponent;
import com.verich.padel.api.application.component.UserComponent;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.domain.service.UserService;

@Service
public class UserUseCase implements UserService {

  @Autowired
  private UserComponent userComp;

  @Autowired
  private PasswordComponent passwordComp;

  @Override
  public User getByNickName(final String nickname, final String password) {
    final User user = userComp.getByNickName(nickname);
    passwordComp.checkPassword(password, user.getHash(), user.getSalt());
    return user;
  }

  @Override
  public User getByEmail(final String email, final String password) {
    final User user = userComp.getByEmail(email);
    passwordComp.checkPassword(password, user.getHash(), user.getSalt());
    return user;
  }

  @Override
  public void create(final User userData, final String password) {
    encriptPassword(userData, password);
    userComp.add(userData);
  }

  @Override
  public void updateData(final User userData, final String password) {

    final User user = getByNickName(userData.getNickname(), password);

    userData.setHash(user.getHash());
    userData.setSalt(user.getSalt());
    userData.setEmail(user.getEmail());
    userData.setLevel(user.getLevel());

    userComp.update(userData);
  }

  @Override
  public void updatePassword(final String nickname, final String password,
      final String newPassword) {

    final User user = getByNickName(nickname, password);
    encriptPassword(user, newPassword);

    userComp.update(user);
  }

  @Override
  public void delete(final String nickname, final String password) {
    getByNickName(nickname, password);
    userComp.delete(nickname);
  }

  private User encriptPassword(final User user, final String newPassword) {

    final String salt = passwordComp.getRandomSalt();
    final String hash = passwordComp.getHash(newPassword, salt);

    user.setSalt(salt);
    user.setHash(hash);

    return user;
  }

}
