package com.anclasoft.coffee.strategies;

import com.anclasoft.admin.InventoryManager;
import com.anclasoft.coffee.ICoffeeStrategy;
import com.anclasoft.enums.Coffees;
import com.anclasoft.enums.Ingredients;

import java.util.Map;

public class LatteStrategy implements ICoffeeStrategy {
    @Override
    public String createCoffee() {
        InventoryManager.getInstance().decreaseInventory(100, 0, 100, 88.72f);
        return """
                Grinding fine.
                Tamping grounds.
                Extracting espresso.
                Steaming milk.
                Pouring milk.
                Dispensing Latte.
                """;
    }

    @Override
    public Coffees getName() {
        return Coffees.LATTE;
    }

    @Override
    public Map<Ingredients, Float> getIngredients() {
        return Map.of(
                Ingredients.MILK, 88.72f,
                Ingredients.WATER, 100f,
                Ingredients.COFFEE, 100f
        );
    }
}