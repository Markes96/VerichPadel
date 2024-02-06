package com.verich.padel.api.infrastructure.http;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class AbstractController {

  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  @ExceptionHandler(RuntimeException.class)
  public String handleGlobalException(final RuntimeException rte) {
    return rte.getMessage();
  }

}
