package com.anclasoft.enums;

public enum Coffees implements ITitleProvider {
    ESPRESSO("Espresso"),
    AMERICANO("Americano"),
    LATTE("Latte"),
    CAPPUCCINO("Cappuccino");

    public final String title;

    Coffees(final String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
