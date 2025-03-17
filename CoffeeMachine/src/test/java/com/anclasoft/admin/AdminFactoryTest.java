package com.anclasoft.admin;

import com.anclasoft.admin.strategies.CheckIngredientsStrategy;
import com.anclasoft.enums.AdminOptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

@ExtendWith(MockitoExtension.class)
class AdminFactoryTest {
    @InjectMocks
    private AdminFactory adminFactory;

    @Test
    @DisplayName("Testing Admin Factory")
    void testingAdminFactory() {
        assertInstanceOf(CheckIngredientsStrategy.class, adminFactory.getStrategy(AdminOptions.CHECK));
    }

    @Test
    void testingGetInstance() {
        assertInstanceOf(AdminFactory.class, AdminFactory.getInstance());
    }
}
