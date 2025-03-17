package com.ancla.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TextUtilsTest {
  @Test
  @DisplayName("Testing wellcome message")
  void testingWellcomeMessage() {
    String message = """
          Wellcome to the coffe machine, these are the options:
            1. Buy Coffee.
            2. Admin the machine.
        """;

    assertEquals(message, TextUtils.showWellcome());
  }

  @Test
  @DisplayName("Testing printing user options")
  void testingPrintingUserOptions() {
    String message = """
        Which coffe do you want?
          1. Espresso.
          2. Americano.
          3. Latte.
          4. Cappuccino.
        """;

    assertEquals(message, TextUtils.printToUserCoffees());
  }

  @Test
  @DisplayName("Testing print admin options")
  void testingPrintingAdminOptions() {
    String message = """
        Which admin option do you want to perform:
          1. Check Ingredients.
          2. Refill Ingredients.
          3. Display Ingredients Levels.
        """;
    assertEquals(message, TextUtils.printAdminOptions());
  }

  @Test
  @DisplayName("Testing ending flow")
  void testingEndindFlowText() {
    String message = "Thanks for using our services, here is your change of $0.50";

    assertEquals(message, TextUtils.printEndFlow(0.5f));
  }
}
