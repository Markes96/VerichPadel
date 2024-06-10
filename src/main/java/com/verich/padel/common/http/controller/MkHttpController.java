package com.verich.padel.common.http.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.verich.padel.common.domain.type.MkDomainObject;

public abstract class MkHttpController<Service, Dom extends MkDomainObject> {

  @Autowired
  protected Service service;

  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  @ExceptionHandler(RuntimeException.class)
  public String handleGlobalException(final RuntimeException rte) {
    return rte.getMessage();
  }

}
