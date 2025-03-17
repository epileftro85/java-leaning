package com.anclasoft.admin.strategies;

import com.anclasoft.admin.IAdminStrategy;
import com.anclasoft.admin.InventoryManager;
import com.anclasoft.models.Inventory;
import com.anclasoft.services.InputService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RefillIngredientsStrategy implements IAdminStrategy {
    private static final String INSERT_AMOUNT = "Insert amount for: %s";
    private final InventoryManager inventoryManager = InventoryManager.getInstance();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public String execute() {
        try {
            float water = getAmount("Water");
            float sugar = getAmount("Sugar");
            float coffee = getAmount("Coffee");
            float milk = getAmount("Milk");
            inventoryManager.increaseInventory(water, sugar, coffee, milk);
            Inventory inventory = inventoryManager.getInventory();
            return "This are the new levels: Water: %.0f, Sugar: %.0f, Coffee: %.0f, Milk: %.0f"
                    .formatted(inventory.getWater(), inventory.getSugar(), inventory.getCoffee(), inventory.getMilk());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private float getAmount(String property) throws IOException {
        System.out.printf((INSERT_AMOUNT) + "%n", property);
        return Float.parseFloat(InputService.getInstance().readLine().trim());
    }
}
