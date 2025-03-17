package com.anclasoft;

import com.anclasoft.admin.AdminFactory;
import com.anclasoft.enums.AdminOptions;
import com.anclasoft.utils.TextUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeMachine {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private boolean run = true;

    public void execute() {
        try {
            while (run) {
                System.out.println(TextUtils.SHOW_WELCOME);
                String input = reader.readLine();

                if ("0".equals(input)) {
                    System.out.println("Bye");
                    run = false;
                } else if ("1".equals(input)) {
                    System.out.println("Buying coffee");
                } else if ("2".equals(input)) {
                    callAdminOptions();
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.printf("Error in CoffeeMachine %s in line %s%n", e.getMessage(), e.getStackTrace());
        }
    }

    private void callAdminOptions() {
        try {
            System.out.println(TextUtils.PRINT_ADMIN_OPTIONS);
            int option = Integer.parseInt(reader.readLine());
            if (option < 0 || option > AdminOptions.values().length) {
                System.out.println("Invalid Admin Option");
                callAdminOptions();
            }
            AdminOptions adminOption = AdminOptions.getByOrder(option);
            AdminFactory.getInstance().getStrategy(adminOption).execute();
        } catch (Exception e) {
            System.out.printf("Error on CoffeeMachine Admin Options, %s, %s%n", e.getMessage(), e.getStackTrace());
        }
    }
}
