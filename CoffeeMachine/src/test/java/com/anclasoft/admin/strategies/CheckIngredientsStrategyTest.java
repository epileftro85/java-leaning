package com.anclasoft.admin.strategies;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CheckIngredientsStrategyTest {
    @InjectMocks
    private CheckIngredientsStrategy strategy;

    @Test
    @DisplayName("testing checking coffees quantity")
    void testingCheckingCoffeesQuantity() {
        String expecting = """
                Checking Ingredients
                AMERICANO: 5
                CAPPUCCINO: 7
                ESPRESSO: 10
                LATTE: 10""";

        assertEquals(expecting, strategy.execute());
    }
}
