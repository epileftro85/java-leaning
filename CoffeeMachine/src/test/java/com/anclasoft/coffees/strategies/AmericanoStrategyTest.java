package com.anclasoft.coffees.strategies;

import com.anclasoft.admin.InventoryManager;
import com.anclasoft.coffee.strategies.AmericanoStrategy;
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
class AmericanoStrategyTest {
    @InjectMocks
    private AmericanoStrategy americanoStrategy;

    @Test
    @DisplayName("Testing getName of Americano")
    void testingGetNameOfAmericano() {
        assertEquals(Coffees.AMERICANO, americanoStrategy.getName());
    }

    @Test
    @DisplayName("Testing getIngredients of Americano")
    void testingGetIngredientsOfAmericano() {
        Map<Ingredients, Float> expected = Map.of(
                Ingredients.WATER, 200f,
                Ingredients.COFFEE,100f
        );

        assertEquals(expected, americanoStrategy.getIngredients());
    }

    @Test
    @DisplayName("Testing Americano preparation")
    void testingAmericanoPreparation() {
        String expected = """
                Grinding fine.
                Tamping grounds.
                Extracting espresso.
                Adding hot water.
                Dispensing Americano.
                """;
        String output = americanoStrategy.createCoffee();

        assertEquals(expected, output);
        assertEquals(800, InventoryManager.getInstance().getInventory().getWater());
        assertEquals(900, InventoryManager.getInstance().getInventory().getCoffee());
        InventoryManager.getInstance().increaseInventory(200, 0, 100, 0);
    }
}
