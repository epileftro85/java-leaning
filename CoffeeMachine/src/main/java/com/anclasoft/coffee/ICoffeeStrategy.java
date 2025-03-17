package com.anclasoft.coffee;

import com.anclasoft.enums.Coffees;
import com.anclasoft.enums.Ingredients;

import java.util.Map;

public interface ICoffeeStrategy {
    void createCoffee();

    Coffees getName();

    Map<Ingredients, Float> getIngredients();
}
