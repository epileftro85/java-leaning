package com.ancla.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InventoryTest {
  @Test
  @DisplayName("Testing creation of Inventory")
  void testingCreationOfInventory() {
    Inventory inventory = new Inventory(100, 100, 100, 100, 100);

    assertEquals(100, inventory.getMilk());
    assertEquals(100, inventory.getSugar());
    assertEquals(100, inventory.getCoffee());
    assertEquals(100, inventory.getWater());
    assertEquals(100, inventory.getMoney());
  }
}
