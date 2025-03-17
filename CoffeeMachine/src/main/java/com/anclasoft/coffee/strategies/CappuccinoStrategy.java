package com.anclasoft.coffee.strategies;

import com.anclasoft.admin.InventoryManager;
import com.anclasoft.coffee.ICoffeeStrategy;
import com.anclasoft.enums.Coffees;
import com.anclasoft.enums.Ingredients;

import java.util.Map;

public class CappuccinoStrategy implements ICoffeeStrategy {
    @Override
    public String createCoffee() {
        InventoryManager.getInstance().decreaseInventory(150, 0, 150, 150);
        return """
                Grinding fine.
                Tamping grounds.
                Extracting espresso.
                Steaming milk.
                Frothing milk.
                Pouring milk and foam.
                Dispensing Cappuccino.
                """;
    }

    @Override
    public Coffees getName() {
        return Coffees.CAPPUCCINO;
    }

    @Override
    public Map<Ingredients, Float> getIngredients() {
        return Map.of(
                Ingredients.MILK, 150f,
                Ingredients.WATER, 150f,
                Ingredients.COFFEE, 150f
        );
    }
}
