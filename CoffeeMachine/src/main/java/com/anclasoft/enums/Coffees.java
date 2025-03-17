package com.anclasoft.enums;

public enum Coffees implements IEnumProvider {
    ESPRESSO("Espresso", 1),
    AMERICANO("Americano", 2),
    LATTE("Latte", 3),
    CAPPUCCINO("Cappuccino", 4);

    public final String title;
    public final int order;

    Coffees(final String title, int order) {
        this.title = title;
        this.order = order;
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
