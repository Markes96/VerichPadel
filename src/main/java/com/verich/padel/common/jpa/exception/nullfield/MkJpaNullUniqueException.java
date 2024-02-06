package com.verich.padel.common.jpa.exception.nullfield;

import java.lang.reflect.Field;
import java.util.List;
import com.verich.padel.common.jpa.exception.MkJpaNullFieldException;
import lombok.Getter;

@Getter
public class MkJpaNullUniqueException extends MkJpaNullFieldException {

  private static final long serialVersionUID = 1L;

  final List<String> uniqueFiledsNames;

  public MkJpaNullUniqueException(final List<Field> uniqueFileds) {
    uniqueFiledsNames = uniqueFileds.stream().map(Field::getName).toList();
  }

}
