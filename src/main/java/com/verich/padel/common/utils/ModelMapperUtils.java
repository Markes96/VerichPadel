package com.verich.padel.common.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.spi.DestinationSetter;
import org.modelmapper.spi.SourceGetter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ModelMapperUtils {

  public <SRC> SourceGetter<SRC> findGetter(final String srcName,
      final Class<SRC> srcType) {

    final String getterName = "get" + StringUtils.capitalize(srcName);
    final Method getter = ReflectionUtils.findMethodByName(getterName, srcType);

    return (src) -> {
      try {
        return getter.invoke(src);
      } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        throw new RuntimeException(e);
      }
    };
  }

  public <DST, VALUE> DestinationSetter<DST, VALUE> findSetter(final String dstName,
      final Class<DST> dstType) {

    final String setterName = "set" + StringUtils.capitalize(dstName);
    final Method setter = ReflectionUtils.findMethodByName(setterName, dstType);

    return (dst, value) -> {
      try {
        setter.invoke(dst, value);
      } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        throw new RuntimeException(e);
      }
    };
  }

}
