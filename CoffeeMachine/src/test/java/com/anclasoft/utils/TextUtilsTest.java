package com.anclasoft.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextUtilsTest {
    @Test
    @DisplayName("Testing welcome message")
    void testingWelcomeMessage() {
        String message = """
                  Welcome to the coffee machine, these are the options:
                    1. Buy Coffee.
                    2. Admin the machine.
                    0. Exit.
                """;

        assertEquals(message, TextUtils.SHOW_WELCOME);
    }

    @Test
    @DisplayName("Testing printing user options")
    void testingPrintingUserOptions() {
        String message = """
                Which coffee do you want?
                  1. Espresso.
                  2. Americano.
                  3. Latte.
                  4. Cappuccino.
                """;

        assertEquals(message, TextUtils.PRINT_TO_USER_COFFEES);
    }

    @Test
    @DisplayName("Testing print admin options")
    void testingPrintingAdminOptions() {
        String message = """
                Which admin option do you want to perform:
                  1. Check Ingredients.
                  2. Refill Ingredients.
                  3. Display Ingredients Levels.
                  0. Go Back
                """;
        assertEquals(message, TextUtils.PRINT_ADMIN_OPTIONS);
    }

    @Test
    @DisplayName("Testing ending flow")
    void testingEndingFlowText() {
        String message = "Thanks for using our services, here is your change of $0.50";

        assertEquals(message, TextUtils.printEndFlow(0.5f));
    }

}
