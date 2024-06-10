package com.verich.padel.common.type.clazz;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class MkObject {

  @Override
  public String toString() {
    try {
      return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this);
    } catch (final JsonProcessingException e) {
      return e.getMessage() + " -> " + e;
    }
  }

}
