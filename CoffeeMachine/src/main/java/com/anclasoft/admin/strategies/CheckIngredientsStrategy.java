package com.anclasoft.admin.strategies;

import com.anclasoft.admin.IAdminStrategy;
import com.anclasoft.admin.InventoryManager;
import com.anclasoft.coffee.CoffeeFactory;
import com.anclasoft.enums.Coffees;
import com.anclasoft.enums.Ingredients;
import com.anclasoft.models.Inventory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckIngredientsStrategy implements IAdminStrategy {
    private static final Inventory INVENTORY = InventoryManager.getInstance().getInventory();

    /*
     * We get the inventory ingredient and divide it against the current coffee quantity of this ingredient
     * After all ingredients has been calculated, we return the lowest quantity
     *
     * @param Coffee option which coffee wants to calculate
     * @return int The quantity if a coffee option can be made with the current inventory
     */
    public static int calculateCoffee(Coffees option) {
        Map<Ingredients, Float> ingredients = CoffeeFactory.getInstance().getStrategy(option).getIngredients();
        float milk = INVENTORY.getMilk() / ingredients.getOrDefault(Ingredients.MILK, 0f);
        float coffee = INVENTORY.getCoffee() / ingredients.getOrDefault(Ingredients.COFFEE, 0f);
        float watter = INVENTORY.getWater() / ingredients.getOrDefault(Ingredients.WATER, 0f);

        return Math.round(Math.min(milk, Math.min(coffee, watter)));
    }

    /*
     * We iterate on each coffee from the enum, convert it to a map of <Coffees, Integer> where the integer comes
     * from the calculation of how many coffees can make with the current inventory
     *
     * @return String
     */
    @Override
    public String execute() {
        StringBuilder message = new StringBuilder();
        message.append("Checking Ingredients");
        Arrays.stream(Coffees.values())
                .sorted(Comparator.comparing(Enum::name))
                .collect(Collectors.toMap(
                        coffee -> coffee,
                        CheckIngredientsStrategy::calculateCoffee,
                        (oldValue, newValue) -> oldValue, //Handling potential duplicate keys
                        LinkedHashMap::new //Create a LinkedHashMap to keep the sorted by alphabetically
                ))
                .forEach((coffee, qty) -> message.append("\n%s: %d".formatted(coffee, qty)));

        return message.toString();
    }
}
