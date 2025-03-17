package com.anclasoft.utils;

import com.anclasoft.enums.ITitleProvider;

import java.util.Arrays;
import java.util.List;

public class EnumUtils {
    private EnumUtils() {
    }

    public static <E extends Enum<E> & ITitleProvider> List<String> getTitleAsList(Class<E> e) {
        return Arrays.stream(e.getEnumConstants())
                .map(ITitleProvider::getTitle)
                .toList();
    }

}
