package com.anclasoft.admin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InventoryManagerTest {
    @Test
    @DisplayName("Testing creating inventory class")
    void testingCreatingInventoryClass() {
        InventoryManager iManager = InventoryManager.getInstance();

        assertEquals(1000, iManager.getInventory().getMoney());
        assertEquals(1000, iManager.getInventory().getMilk());
        assertEquals(1000, iManager.getInventory().getWater());
        assertEquals(1000, iManager.getInventory().getSugar());
        assertEquals(1000, iManager.getInventory().getCoffee());

        iManager.handleOneItem("Money", 100f, true);
        assertEquals(1100, iManager.getInventory().getMoney());

        iManager.handleOneItem("Money", 100f, false);
        assertEquals(1000, iManager.getInventory().getMoney());

        iManager.increaseInventory(100, 100, 100, 100);

        assertEquals(1000, iManager.getInventory().getMoney());
        assertEquals(1100, iManager.getInventory().getMilk());
        assertEquals(1100, iManager.getInventory().getWater());
        assertEquals(1100, iManager.getInventory().getSugar());
        assertEquals(1100, iManager.getInventory().getCoffee());

        iManager.decreaseInventory(100, 100, 100, 100);

        assertEquals(1000, iManager.getInventory().getMilk());
        assertEquals(1000, iManager.getInventory().getWater());
        assertEquals(1000, iManager.getInventory().getSugar());
        assertEquals(1000, iManager.getInventory().getCoffee());
    }

}
