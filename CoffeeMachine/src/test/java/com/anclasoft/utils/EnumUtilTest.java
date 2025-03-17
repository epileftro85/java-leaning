package com.anclasoft.utils;

import com.anclasoft.enums.Coffees;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.anclasoft.enums.Coffees.AMERICANO;
import static com.anclasoft.enums.Coffees.CAPPUCCINO;
import static com.anclasoft.enums.Coffees.ESPRESSO;
import static com.anclasoft.enums.Coffees.LATTE;
import static com.anclasoft.utils.EnumUtils.getByOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumUtilTest {
    @Test
    @DisplayName("Testing get title as list")
    void testingGetTitleAsList() {
        List<String> listing = List.of("Espresso", "Americano", "Latte", "Cappuccino");
        assertEquals(listing, EnumUtils.getTitleAsList(Coffees.class));
    }

    @Test
    @DisplayName("Testing get enum by order")
    void testingGetByOrder() {
        assertEquals(ESPRESSO.name(), getByOrder(Coffees.class, 1).name());
        assertEquals(AMERICANO.name(), getByOrder(Coffees.class, 2).name());
        assertEquals(LATTE.name(), getByOrder(Coffees.class, 3).name());
        assertEquals(CAPPUCCINO.name(), getByOrder(Coffees.class, 4).name());
    }
}
