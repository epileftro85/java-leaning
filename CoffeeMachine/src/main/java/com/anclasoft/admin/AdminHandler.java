package com.anclasoft.admin;

import com.anclasoft.enums.AdminOptions;
import com.anclasoft.services.InputService;
import com.anclasoft.utils.TextUtils;

import java.io.IOException;

public class AdminHandler {
    public void callAdminOptions() throws IOException {
        System.out.println(TextUtils.PRINT_ADMIN_OPTIONS);
        int option = Integer.parseInt(InputService.getInstance().readLine());

        if (option <= 0 || option > AdminOptions.values().length) {
            System.out.println("Invalid Admin Option");
            return;
        }

        String response = AdminFactory.getInstance()
                .getStrategy(AdminOptions.getByOrder(option))
                .execute();

        System.out.println(response);
    }
}
