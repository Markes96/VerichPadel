package com.verich.padel.api.application.component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class PasswordComponent {

  private static final String INCORRECT_PASSWORD = "Error, incorrect password -> password: ";

  public void checkPassword(final String password, final String hash, final String salt) {
    final String hashToCompare = getHash(password, salt);
    if (!StringUtils.equals(hash, hashToCompare))
      throw new RuntimeException(INCORRECT_PASSWORD + password);
  }

  public String getHash(final String password, final String salt) {

    final String message_salt = password + salt;

    try {
      final MessageDigest md = MessageDigest.getInstance("SHA-256");
      final byte[] digest = md.digest(message_salt.getBytes());
      return new String(digest, StandardCharsets.UTF_8);
    } catch (final NoSuchAlgorithmException e) {
      throw new RuntimeException(e.toString(), e);
    }

  }

  public String getRandomSalt() {
    return UUID.randomUUID().toString();
  }

}
