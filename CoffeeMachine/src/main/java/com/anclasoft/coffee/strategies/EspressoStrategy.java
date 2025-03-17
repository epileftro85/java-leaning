package com.anclasoft.coffee.strategies;

import com.anclasoft.coffee.ICoffeeStrategy;
import com.anclasoft.enums.Coffees;
import com.anclasoft.enums.Ingredients;

import java.util.Map;

public class EspressoStrategy implements ICoffeeStrategy {
    @Override
    public void createCoffee() {

    }

    @Override
    public Coffees getName() {
        return Coffees.ESPRESSO;
    }

    @Override
    public Map<Ingredients, Float> getIngredients() {
        return Map.of();
    }
}
