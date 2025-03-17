package com.anclasoft.coffee.strategies;

import com.anclasoft.admin.InventoryManager;
import com.anclasoft.coffee.ICoffeeStrategy;
import com.anclasoft.enums.Coffees;
import com.anclasoft.enums.Ingredients;

import java.util.Map;

public class EspressoStrategy implements ICoffeeStrategy {
    @Override
    public String createCoffee() {
        InventoryManager.getInstance().decreaseInventory(100, 0, 100, 0);
        return """
                Grinding fine.
                Tamping grounds.
                Extracting espresso.
                Dispensing espresso.
                """;
    }

    @Override
    public Coffees getName() {
        return Coffees.ESPRESSO;
    }

    @Override
    public Map<Ingredients, Float> getIngredients() {
        return Map.of(
                Ingredients.WATER, 100f,
                Ingredients.COFFEE, 100f
        );
    }
}
