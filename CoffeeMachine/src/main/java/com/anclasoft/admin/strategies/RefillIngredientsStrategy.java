package com.anclasoft.admin.strategies;

import com.anclasoft.admin.IAdminStrategy;

public class RefillIngredientsStrategy implements IAdminStrategy {

    @Override
    public void execute() {
        System.out.println("Refilling...");
    }
}
