package com.ancla.admin;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ancla.admin.strategies.CheckIngredientsStrategy;
import com.ancla.admin.strategies.DisplayLevelsStrategy;
import com.ancla.admin.strategies.RefillIngredientsStrategy;
import com.ancla.enums.AdminOptions;

@ExtendWith(MockitoExtension.class)
public class AdminOptionsFactoryTest {
  @InjectMocks
  private AdminOptionsFactory factory;

  @Test
  @DisplayName("Testing admin factory")
  void testingAdminFactoryCreation() {
    assertTrue(factory.getStrategy(AdminOptions.CHECK) instanceof CheckIngredientsStrategy);
    assertTrue(factory.getStrategy(AdminOptions.DISPLAY_LEVELS) instanceof DisplayLevelsStrategy);
    assertTrue(factory.getStrategy(AdminOptions.REFILL) instanceof RefillIngredientsStrategy);
  }
}
