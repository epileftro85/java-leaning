package com.anclasoft.coffee;

import com.anclasoft.admin.strategies.CheckIngredientsStrategy;
import com.anclasoft.enums.Coffees;
import com.anclasoft.services.InputService;
import com.anclasoft.utils.EnumUtils;
import com.anclasoft.utils.TextUtils;

import java.io.IOException;

public class CoffeeHandler {
    public void callUserOptions() throws IOException {
        System.out.println(TextUtils.PRINT_TO_USER_COFFEES);
        int option = Integer.parseInt(InputService.getInstance().readLine());

        if (option <= 0 || option > Coffees.values().length) {
            System.out.println("Invalid Coffee Option");
            return;
        }
        Coffees coffee = EnumUtils.getByOrder(Coffees.class, option);
        int coffeesQty = CheckIngredientsStrategy.calculateCoffee(coffee);

        if (coffeesQty <= 0) {
            System.out.println("Not enough ingredients for your beverage");
            return;
        }

        String creation = CoffeeFactory.getInstance().getStrategy(coffee).createCoffee();
        System.out.println(creation);
    }
}
