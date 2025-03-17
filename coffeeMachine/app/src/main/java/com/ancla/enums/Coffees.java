package com.ancla.enums;

public enum Coffees implements ITitleProvider {
  ESPRESSO("Espresso"),
  AMERICANO("Americano"),
  LATTE("Latte"),
  CAPPUCCINO("Cappuccino");

  public final String title;

  private Coffees(final String title) {
    this.title = title;
  }

  @Override
  public String getTitle() {
    return this.title;
  }
}
