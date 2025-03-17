package com.anclasoft.coffees;

import com.anclasoft.coffee.CoffeeFactory;
import com.anclasoft.coffee.strategies.AmericanoStrategy;
import com.anclasoft.coffee.strategies.CappuccinoStrategy;
import com.anclasoft.coffee.strategies.EspressoStrategy;
import com.anclasoft.coffee.strategies.LatteStrategy;
import com.anclasoft.enums.Coffees;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class CoffeeFactoryTest {
    @InjectMocks
    private CoffeeFactory coffeeFactory;

    @Test
    @DisplayName("Testing coffee factory instance")
    void testingCoffeeFactoryInstance() {
        assertInstanceOf(CoffeeFactory.class, coffeeFactory.getInstance());
    }

    @Test
    @DisplayName("Testing coffee factory getStrategy")
    void testingCoffeeFactoryGetStrategy() {
        assertInstanceOf(AmericanoStrategy.class, coffeeFactory.getInstance().getStrategy(Coffees.AMERICANO));
        assertInstanceOf(CappuccinoStrategy.class, coffeeFactory.getInstance().getStrategy(Coffees.CAPPUCCINO));
        assertInstanceOf(EspressoStrategy.class, coffeeFactory.getInstance().getStrategy(Coffees.ESPRESSO));
        assertInstanceOf(LatteStrategy.class, coffeeFactory.getInstance().getStrategy(Coffees.LATTE));
    }
}
