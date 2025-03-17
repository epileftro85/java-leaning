package com.anclasoft.enums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeesTest {
    @Test
    @DisplayName("Testing Coffees enum")
    void testCoffeesEnum() {
        assertEquals(4, Coffees.values().length);
        assertEquals("ESPRESSO", Coffees.ESPRESSO.name());
        assertEquals("AMERICANO", Coffees.AMERICANO.name());
        assertEquals("LATTE", Coffees.LATTE.name());
        assertEquals("CAPPUCCINO", Coffees.CAPPUCCINO.name());
    }

}
