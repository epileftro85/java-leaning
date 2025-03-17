package com.ancla.utils;

import java.util.Arrays;
import java.util.List;

import com.ancla.enums.ITitleProvider;

public class EnumUtil {
  private EnumUtil() {
  }

  public static <E extends Enum<E> & ITitleProvider> List<String> getTitleAsList(Class<E> e) {
    return Arrays.stream(e.getEnumConstants())
        .map(ITitleProvider::getTitle)
        .toList();
  }
}
