package com.anclasoft.utils;

import com.anclasoft.enums.AdminOptions;
import com.anclasoft.enums.Coffees;

public class TextUtils {
    public static final String SHOW_WELCOME = """
              Welcome to the coffee machine, these are the options:
                1. Buy Coffee.
                2. Admin the machine.
                0. Exit.
            """;
    public static final String PRINT_TO_USER_COFFEES = """
            Which coffee do you want?
              1. %s.
              2. %s.
              3. %s.
              4. %s.
            """.formatted(EnumUtils.getTitleAsList(Coffees.class).toArray());
    public static final String PRINT_ADMIN_OPTIONS = """
            Which admin option do you want to perform:
              1. %s.
              2. %s.
              3. %s.
              0. Go Back
            """.formatted(EnumUtils.getTitleAsList(AdminOptions.class).toArray());

    private TextUtils() {
    }

    public static Object printEndFlow(float change) {
        return "Thanks for using our services, here is your change of $%.2f".formatted(change);
    }
}
