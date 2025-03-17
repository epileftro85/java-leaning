package com.anclasoft.admin.strategies;

import com.anclasoft.admin.IAdminStrategy;

public class DisplayLevelsStrategy implements IAdminStrategy {
    @Override
    public void execute() {
        System.out.println("Display Levels");
    }
}
