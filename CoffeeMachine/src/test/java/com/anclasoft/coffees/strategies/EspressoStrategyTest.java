package com.anclasoft.coffees.strategies;

import com.anclasoft.admin.InventoryManager;
import com.anclasoft.coffee.strategies.EspressoStrategy;
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
public class EspressoStrategyTest {
    @InjectMocks
    private EspressoStrategy espresso;

    @Test
    @DisplayName("Testing getName of Espresso")
    void testingGetNameOfEspresso() {
        assertEquals(Coffees.ESPRESSO, espresso.getName());
    }

    @Test
    @DisplayName("Testing getIngredients of Espresso")
    void testingGetIngredientsOfEspresso() {
        Map<Ingredients, Float> expected = Map.of(
                Ingredients.WATER, 100f,
                Ingredients.COFFEE,100f
        );

        assertEquals(expected, espresso.getIngredients());
    }

    @Test
    @DisplayName("Testing Espresso preparation")
    void testingEspressoPreparation() {
        String expected = """
                Grinding fine.
                Tamping grounds.
                Extracting espresso.
                Dispensing espresso.
                """;
        String output = espresso.createCoffee();

        assertEquals(expected, output);
        assertEquals(900, InventoryManager.getInstance().getInventory().getWater());
        assertEquals(900, InventoryManager.getInstance().getInventory().getCoffee());
        InventoryManager.getInstance().increaseInventory(100, 0, 100, 0);
    }
}
