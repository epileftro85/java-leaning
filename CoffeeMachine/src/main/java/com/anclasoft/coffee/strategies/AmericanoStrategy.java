package com.anclasoft.coffee.strategies;

import com.anclasoft.admin.InventoryManager;
import com.anclasoft.coffee.ICoffeeStrategy;
import com.anclasoft.enums.Coffees;
import com.anclasoft.enums.Ingredients;

import java.util.Map;

public class AmericanoStrategy implements ICoffeeStrategy {
    @Override
    public String createCoffee() {
        InventoryManager.getInstance().decreaseInventory(200, 0, 100, 0);
        return """
                Grinding fine.
                Tamping grounds.
                Extracting espresso.
                Adding hot water.
                Dispensing Americano.
                """;
    }

    @Override
    public Coffees getName() {
        return Coffees.AMERICANO;
    }

    @Override
    public Map<Ingredients, Float> getIngredients() {
        return Map.of(
                Ingredients.WATER, 200f,
                Ingredients.COFFEE, 100f
        );
    }
}
