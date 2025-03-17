package com.ancla.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IngredientsTest {
  @Test
  @DisplayName("Testing ingredients enum")
  void testingIngredientsEnum() {
    assertEquals(4, Ingredients.values().length);
    assertEquals("MILK", Ingredients.MILK.name());
    assertEquals("COFFEE", Ingredients.COFFEE.name());
    assertEquals("SUGGAR", Ingredients.SUGGAR.name());
    assertEquals("WATER", Ingredients.WATER.name());
  }
}
