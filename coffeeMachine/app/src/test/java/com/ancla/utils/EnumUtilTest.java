package com.ancla.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ancla.enums.Coffees;

public class EnumUtilTest {
  @Test
  @DisplayName("Testing Enum util")
  void testingEnumUtils() {
    List<String> listing = List.of("Espresso", "Americano", "Latte", "Cappuccino");
    assertEquals(listing, EnumUtil.getTitleAsList(Coffees.class));
  }
}
