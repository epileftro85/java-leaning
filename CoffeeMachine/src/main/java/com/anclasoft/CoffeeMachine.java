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

                switch (input.trim()) {
                    case "0" -> {
                        System.out.println("Bye");
                        run = false;
                    }
                    case "1" -> {
                        System.out.println("Buying coffee");
                    }
                    case "2" -> {
                        callAdminOptions();
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.printf("Error in CoffeeMachine %s%n", e.getMessage());
        }
    }

    private void callAdminOptions() throws IOException {
        System.out.println(TextUtils.PRINT_ADMIN_OPTIONS);
        int option = Integer.parseInt(reader.readLine());

        if (option == 0) {
            execute();
            return;
        }

        if (option < 0 || option > AdminOptions.values().length) {
            System.out.println("Invalid Admin Option");
            return;
        }
        AdminFactory.getInstance()
                .getStrategy(AdminOptions.getByOrder(option))
                .execute();
    }
}
