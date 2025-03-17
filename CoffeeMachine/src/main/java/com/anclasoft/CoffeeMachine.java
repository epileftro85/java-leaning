package com.anclasoft;

import com.anclasoft.admin.AdminHandler;
import com.anclasoft.coffee.CoffeeHandler;
import com.anclasoft.services.InputService;
import com.anclasoft.utils.TextUtils;

import java.io.IOException;

public class CoffeeMachine {
    private boolean run = true;

    public void execute() {
        try {
            while (run) {
                System.out.println(TextUtils.SHOW_WELCOME);
                String input = InputService.getInstance().readLine();
                scanOption(input);
            }
        } catch (IOException e) {
            System.out.printf("Error in CoffeeMachine %s%n", e.getMessage());
        }
    }

    private void scanOption(String input) throws IOException {
        AdminHandler adminHandler = new AdminHandler();
        CoffeeHandler coffeeHandler = new CoffeeHandler();

        switch (input.trim()) {
            case "0" -> {
                System.out.println("Bye");
                run = false;
            }
            case "1" -> {
                System.out.println("Preparing your order");
                coffeeHandler.callUserOptions();
            }
            case "2" -> {
                adminHandler.callAdminOptions();
            }
        }
    }
}
