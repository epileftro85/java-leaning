package com.ancla.enums;

public enum AdminOptions implements ITitleProvider {
  CHECK("Check Ingredients"),
  REFILL("Refill Ingredients"),
  DISPLAY_LEVELS("Display Ingredients Levels");

  public final String title;

  private AdminOptions(final String title) {
    this.title = title;
  }

  @Override
  public String getTitle() {
    return this.title;
  }
}
