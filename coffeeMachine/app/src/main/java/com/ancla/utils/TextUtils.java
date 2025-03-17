package com.ancla.utils;

import com.ancla.enums.AdminOptions;
import com.ancla.enums.Coffees;

public class TextUtils {
  private TextUtils() {
  }

  public static String showWellcome() {
    return """
          Wellcome to the coffe machine, these are the options:
            1. Buy Coffee.
            2. Admin the machine.
        """;
  }

  public static String printToUserCoffees() {
    return """
        Which coffe do you want?
          1. %s.
          2. %s.
          3. %s.
          4. %s.
        """.formatted(EnumUtil.getTitleAsList(Coffees.class).toArray());
  }

  public static String printAdminOptions() {
    return """
        Which admin option do you want to perform:
          1. %s.
          2. %s.
          3. %s.
        """.formatted(EnumUtil.getTitleAsList(AdminOptions.class).toArray());
  }

  public static Object printEndFlow(float change) {
    return "Thanks for using our services, here is your change of $%.2f".formatted(change);
  }
}
