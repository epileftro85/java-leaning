package com.anclasoft.enums;

import java.util.Arrays;

public enum AdminOptions implements IEnumProvider {
    CHECK("Check Ingredients", 1),
    REFILL("Refill Ingredients", 2),
    DISPLAY_LEVELS("Display Ingredients Levels", 3);

    public final String title;
    public final int order;

    AdminOptions(final String title, final int order) {
        this.title = title;
        this.order = order;
    }

    public static AdminOptions getByOrder(int order) {
        return Arrays.stream(values())
                .filter(opt -> opt.order == order)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Unknown Admin Option"));
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getOrder() {
        return this.order;
    }
}

