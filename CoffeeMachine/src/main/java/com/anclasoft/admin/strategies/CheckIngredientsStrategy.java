package com.anclasoft.admin.strategies;

import com.anclasoft.admin.IAdminStrategy;

public class CheckIngredientsStrategy implements IAdminStrategy {
    @Override
    public void execute() {
        System.out.println("Checking Ingredients");
    }
}
