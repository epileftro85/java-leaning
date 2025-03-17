package com.anclasoft.admin;

import com.anclasoft.admin.strategies.CheckIngredientsStrategy;
import com.anclasoft.enums.AdminOptions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AdminFactory {
    private static final AdminFactory instance = new AdminFactory();

    private Map<AdminOptions, IAdminStrategy> strategies = new HashMap<>(); // Temporary mutable map

    private AdminFactory() {
        strategies.put(AdminOptions.CHECK, new CheckIngredientsStrategy());
        // strategies.put(AdminOptions.REFILL, new RefillIngredientsStrategy());
        // strategies.put(AdminOptions.DISPLAY_LEVELS, new DisplayLevelsStrategy());

        this.strategies = Collections.unmodifiableMap(strategies); // Make it immutable
    }

    public static AdminFactory getInstance() {
        return instance;
    }

    public IAdminStrategy getStrategy(AdminOptions option) {
        return strategies.getOrDefault(option, new CheckIngredientsStrategy());
    }

}
