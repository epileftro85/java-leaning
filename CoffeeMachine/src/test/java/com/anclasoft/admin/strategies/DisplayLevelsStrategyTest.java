package com.anclasoft.admin.strategies;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class DisplayLevelsStrategyTest {
    @InjectMocks
    private DisplayLevelsStrategy displayLevelsStrategy;

    @Test
    @DisplayName("Testing displaying levels")
    void testingDisplayingLevels() {
        String message = """
                Ingredient levels are:
                Milk: 1000 Gr
                Sugar: 1000 Gr
                Coffee: 1000 Gr
                Money: $1000""";

        assertEquals(message,  displayLevelsStrategy.execute());
    }
}
