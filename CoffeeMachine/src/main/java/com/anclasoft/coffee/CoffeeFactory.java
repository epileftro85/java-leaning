package com.anclasoft.coffee;

import com.anclasoft.coffee.strategies.AmericanoStrategy;
import com.anclasoft.coffee.strategies.CappuccinoStrategy;
import com.anclasoft.coffee.strategies.EspressoStrategy;
import com.anclasoft.coffee.strategies.LatteStrategy;
import com.anclasoft.enums.Coffees;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CoffeeFactory {
    private final static CoffeeFactory INSTANCE = new CoffeeFactory();
    private Map<Coffees, ICoffeeStrategy> strategies = new HashMap<>();

    private CoffeeFactory() {
        strategies.put(Coffees.AMERICANO, new AmericanoStrategy());
        strategies.put(Coffees.CAPPUCCINO, new CappuccinoStrategy());
        strategies.put(Coffees.ESPRESSO, new EspressoStrategy());
        strategies.put(Coffees.LATTE, new LatteStrategy());

        strategies = Collections.unmodifiableMap(strategies);
    }

    public static CoffeeFactory getInstance() {
        return INSTANCE;
    }

    public ICoffeeStrategy getStrategy(Coffees coffee) {
        return strategies.getOrDefault(coffee, new AmericanoStrategy());
    }
}
