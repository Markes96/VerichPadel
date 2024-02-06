package com.verich.padel.api.application.component;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.common.jpa.port.MkJpaWriterPort;

@Component
public class UserComponent {

  @Autowired
  MkJpaWriterPort<User> userWriter;

  private static final String USER_DONT_EXIST = "Error, user do not exist -> ";
  private static final String NICKNAME = "nickname: ";
  private static final String EMAIL = "email: ";

  public User getByNickName(final String nickName) {
    final User filter = new User(nickName);
    final User user = userWriter.findOne(filter);
    if (Objects.isNull(user))
      throw new RuntimeException(USER_DONT_EXIST + NICKNAME + nickName);
    return user;
  }

  public User getByEmail(final String email) {
    final User filter = new User();
    filter.setEmail(email);
    final User user = userWriter.findOne(filter);
    if (Objects.isNull(user))
      throw new RuntimeException(USER_DONT_EXIST + EMAIL + email);
    return user;
  }

  public void add(final User userData) {
    userWriter.add(userData);
  }

  public void update(final User userData) {
    userWriter.update(userData);
  }

  public void delete(final String nickName) {
    final User filter = new User(nickName);
    userWriter.delete(filter);
  }

}
