package com.ancla.admin.strategies;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ancla.utils.TextUtils;

@ExtendWith(MockitoExtension.class)
class CheckIngredientsTest {
  @Mock
  private TextUtils textUtils;

  @Test
  @DisplayName("Testing Check Ingredients strategy")
  void testCheckIngredientsStrategy() {
    CheckIngredientsStrategy strategy = new CheckIngredientsStrategy();
    String message = """
        Which admin option do you want to perform:
          1. %s.
          2. %s.
          3. %s.
        """;

    try (MockedStatic<TextUtils> textUtil = Mockito.mockStatic(TextUtils.class)) {
      Mockito.when(TextUtils.printAdminOptions()).thenReturn(message);
      strategy.execute();
      textUtil.verify(() -> TextUtils.printAdminOptions());
    }
  }
}
