package com.verich.padel.common.jpa.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MkJpaException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public MkJpaException(final String message) {
    super(message);
  }

}
