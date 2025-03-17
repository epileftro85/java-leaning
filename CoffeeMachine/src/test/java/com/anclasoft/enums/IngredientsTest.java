package com.anclasoft.enums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IngredientsTest {
    @Test
    @DisplayName("Testing ingredients enum")
    void testingIngredientsEnum() {
        assertEquals(4, Ingredients.values().length);
        assertEquals("MILK", Ingredients.MILK.name());
        assertEquals("COFFEE", Ingredients.COFFEE.name());
        assertEquals("SUGAR", Ingredients.SUGAR.name());
        assertEquals("WATER", Ingredients.WATER.name());
    }
}
