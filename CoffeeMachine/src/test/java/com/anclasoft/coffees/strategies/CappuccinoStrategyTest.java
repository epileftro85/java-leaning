package com.anclasoft.coffees.strategies;

import com.anclasoft.admin.InventoryManager;
import com.anclasoft.coffee.strategies.CappuccinoStrategy;
import com.anclasoft.enums.Coffees;
import com.anclasoft.enums.Ingredients;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CappuccinoStrategyTest {
    @InjectMocks
    private CappuccinoStrategy cappuccino;

    @Test
    @DisplayName("Testing getName of Americano")
    void testingGetNameOfAmericano() {
        assertEquals(Coffees.CAPPUCCINO, cappuccino.getName());
    }

    @Test
    @DisplayName("Testing getIngredients of Americano")
    void testingGetIngredientsOfAmericano() {
        Map<Ingredients, Float> expected = Map.of(
                Ingredients.MILK, 150f,
                Ingredients.WATER, 150f,
                Ingredients.COFFEE,150f
        );

        assertEquals(expected, cappuccino.getIngredients());
    }

    @Test
    @DisplayName("Testing Cappuccino preparation")
    void testingCappuccinoPreparation() {
        String expected = """
                Grinding fine.
                Tamping grounds.
                Extracting espresso.
                Steaming milk.
                Frothing milk.
                Pouring milk and foam.
                Dispensing Cappuccino.
                """;
        String output = cappuccino.createCoffee();

        assertEquals(expected, output);
        assertEquals(850, InventoryManager.getInstance().getInventory().getMilk());
        assertEquals(850, InventoryManager.getInstance().getInventory().getWater());
        assertEquals(850, InventoryManager.getInstance().getInventory().getCoffee());
        InventoryManager.getInstance().increaseInventory(150, 0, 150, 150);
    }
}
