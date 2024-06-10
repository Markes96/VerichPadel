package com.verich.padel.common.utils;

import java.lang.reflect.Method;
import java.util.Optional;
import java.util.stream.Stream;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ReflectionUtils {

  public Method findMethodByName(final String name, final Class<?> clazz) {

    final Optional<Method> methodFinded = Stream.of(clazz.getMethods())
        .filter((method) -> name.equals(method.getName())).findFirst();

    if (methodFinded.isEmpty())
      throw new RuntimeException(
          "Method " + name + " was not found on class " + clazz.getSimpleName());

    return methodFinded.get();
  }

}
