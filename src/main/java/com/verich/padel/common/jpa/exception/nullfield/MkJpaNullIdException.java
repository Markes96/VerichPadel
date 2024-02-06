package com.verich.padel.common.jpa.exception.nullfield;

import java.lang.reflect.Field;
import java.util.List;
import com.verich.padel.common.jpa.exception.MkJpaNullFieldException;
import lombok.Getter;

@Getter
public class MkJpaNullIdException extends MkJpaNullFieldException {

  private static final long serialVersionUID = 1L;

  final List<String> idFiledNames;

  public MkJpaNullIdException(final List<Field> idFiedls) {
    idFiledNames = idFiedls.stream().map(Field::getName).toList();
  }

}
