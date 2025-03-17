package com.anclasoft.admin.strategies;

import com.anclasoft.admin.IAdminStrategy;
import com.anclasoft.admin.InventoryManager;
import com.anclasoft.models.Inventory;

public class DisplayLevelsStrategy implements IAdminStrategy {
    private final Inventory inventory = InventoryManager.getInstance().getInventory();

    @Override
    public String execute() {
        String message = """
                Ingredient levels are:
                Milk: %.0f Gr
                Sugar: %.0f Gr
                Coffee: %.0f Gr
                Money: $%.0f""".formatted(inventory.getMilk(),
                inventory.getSugar(),
                inventory.getCoffee(),
                inventory.getMoney());

        return message;
    }
}
