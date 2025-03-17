package com.anclasoft.admin;

import com.anclasoft.admin.strategies.CheckIngredientsStrategy;
import com.anclasoft.admin.strategies.DisplayLevelsStrategy;
import com.anclasoft.admin.strategies.RefillIngredientsStrategy;
import com.anclasoft.enums.AdminOptions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AdminFactory {
    private static final AdminFactory INSTANCE = new AdminFactory();
    private Map<AdminOptions, IAdminStrategy> strategies = new HashMap<>(); // Temporary mutable map

    private AdminFactory() {
        strategies.put(AdminOptions.CHECK, new CheckIngredientsStrategy());
        strategies.put(AdminOptions.REFILL, new RefillIngredientsStrategy());
        strategies.put(AdminOptions.DISPLAY_LEVELS, new DisplayLevelsStrategy());

        strategies = Collections.unmodifiableMap(strategies); // Make it immutable
    }

    public static AdminFactory getInstance() {
        return INSTANCE;
    }

    /*
     * @param AdminOptions Which of the admin options whe need
     * @return IAdminStrategy Which strategy is selected from the strategies map, default otherwise
     */
    public IAdminStrategy getStrategy(AdminOptions option) {
        return strategies.getOrDefault(option, new CheckIngredientsStrategy());
    }

}
