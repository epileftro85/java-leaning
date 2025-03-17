package com.anclasoft.utils;

import com.anclasoft.enums.Coffees;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumUtilTest {
    @Test
    @DisplayName("Testing Enum util")
    void testingEnumUtils() {
        List<String> listing = List.of("Espresso", "Americano", "Latte", "Cappuccino");
        assertEquals(listing, EnumUtils.getTitleAsList(Coffees.class));
    }
}
