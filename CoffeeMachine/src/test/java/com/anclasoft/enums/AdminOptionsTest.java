package com.anclasoft.enums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdminOptionsTest {
    @Test
    @DisplayName("Testing Admin Options Enum")
    void testingAdminOptionsEnum() {
        assertEquals(3, AdminOptions.values().length);
        assertEquals("CHECK", AdminOptions.CHECK.name());
        assertEquals("REFILL", AdminOptions.REFILL.name());
        assertEquals("DISPLAY_LEVELS", AdminOptions.DISPLAY_LEVELS.name());
    }

}
