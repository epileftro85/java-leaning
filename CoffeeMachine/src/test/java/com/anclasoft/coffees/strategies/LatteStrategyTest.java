package com.anclasoft.coffees.strategies;

import com.anclasoft.admin.InventoryManager;
import com.anclasoft.coffee.strategies.LatteStrategy;
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
public class LatteStrategyTest {
    @InjectMocks
    private LatteStrategy latte;

    @Test
    @DisplayName("Testing getName of Americano")
    void testingGetNameOfAmericano() {
        assertEquals(Coffees.LATTE, latte.getName());
    }

    @Test
    @DisplayName("Testing getIngredients of Americano")
    void testingGetIngredientsOfAmericano() {
        Map<Ingredients, Float> expected = Map.of(
                Ingredients.MILK, 88.72f,
                Ingredients.WATER, 100f,
                Ingredients.COFFEE, 100f
        );

        assertEquals(expected, latte.getIngredients());
    }


    @Test
    @DisplayName("Testing Latte preparation")
    void testingLattePreparation() {
        String expected = """
                Grinding fine.
                Tamping grounds.
                Extracting espresso.
                Steaming milk.
                Pouring milk.
                Dispensing Latte.
                """;
        String output = latte.createCoffee();

        assertEquals(expected, output);
        assertEquals(911.28f, InventoryManager.getInstance().getInventory().getMilk());
        assertEquals(900, InventoryManager.getInstance().getInventory().getWater());
        assertEquals(900, InventoryManager.getInstance().getInventory().getCoffee());
        InventoryManager.getInstance().increaseInventory(100, 0, 100, 88.72f);
    }
}
