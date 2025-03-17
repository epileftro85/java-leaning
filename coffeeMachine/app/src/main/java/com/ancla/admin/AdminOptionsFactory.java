package com.ancla.admin;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.ancla.admin.strategies.CheckIngredientsStrategy;
import com.ancla.admin.strategies.DisplayLevelsStrategy;
import com.ancla.admin.strategies.RefillIngredientsStrategy;
import com.ancla.enums.AdminOptions;

public class AdminOptionsFactory {
  private static final AdminOptionsFactory instance = new AdminOptionsFactory();

  private static final AdminStrategy CHECK_INGREDIENTS = new CheckIngredientsStrategy();
  private static final AdminStrategy REFILL_INGREDIENTS = new RefillIngredientsStrategy();
  private static final AdminStrategy DISPLAY_LEVELS = new DisplayLevelsStrategy();

  private Map<AdminOptions, AdminStrategy> strategies = new HashMap<>(); // Temporary mutable map

  private AdminOptionsFactory() {
    strategies.put(AdminOptions.CHECK, CHECK_INGREDIENTS);
    strategies.put(AdminOptions.REFILL, REFILL_INGREDIENTS);
    strategies.put(AdminOptions.DISPLAY_LEVELS, DISPLAY_LEVELS);

    this.strategies = Collections.unmodifiableMap(strategies); // Make it immutable
  }

  public static AdminOptionsFactory getInstance() {
    return instance;
  }

  public AdminStrategy getStrategy(AdminOptions option) {
    return strategies.getOrDefault(option, CHECK_INGREDIENTS);
  }
}
