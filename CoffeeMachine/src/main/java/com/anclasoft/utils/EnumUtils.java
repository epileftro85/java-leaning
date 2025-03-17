package com.anclasoft.utils;

import com.anclasoft.enums.IEnumProvider;

import java.util.Arrays;
import java.util.List;

public class EnumUtils {
    private EnumUtils() {
    }

    /*
     * @param Class<E> which extends from Enum
     * @return List<String> the enum title as list
     */
    public static <E extends Enum<E> & IEnumProvider> List<String> getTitleAsList(Class<E> e) {
        return Arrays.stream(e.getEnumConstants())
                .map(IEnumProvider::getTitle)
                .toList();
    }

    public static <E extends Enum<E> & IEnumProvider> E getByOrder(Class<E> e, int order) {
        return Arrays.stream(e.getEnumConstants())
                .filter(opt -> opt.getOrder() == order)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Unknown Admin Option"));
    }
}
