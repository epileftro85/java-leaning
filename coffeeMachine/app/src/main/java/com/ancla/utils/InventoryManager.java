package com.ancla.utils;

import java.lang.reflect.Method;

import com.ancla.models.Inventory;

public final class InventoryManager {
  private static final InventoryManager instance = new InventoryManager();
  private Inventory inventory = new Inventory(1000, 1000, 1000, 1000, 1000);

  private InventoryManager() {
  }

  public static InventoryManager getInstance() {
    return instance;
  }

  public Inventory getInventory() {
    return this.inventory;
  }

  public void increaseInventory(float water, float sugar, float coffee, float milk) {
    this.inventory.setMilk(this.inventory.getMilk() + milk);
    this.inventory.setWater(this.inventory.getWater() + water);
    this.inventory.setSugar(this.inventory.getSugar() + sugar);
    this.inventory.setCoffee(this.inventory.getCoffee() + coffee);
  }

  public void decreaseInventory(float water, float sugar, float coffee, float milk) {
    this.inventory.setMilk(this.inventory.getMilk() - milk);
    this.inventory.setWater(this.inventory.getWater() - water);
    this.inventory.setSugar(this.inventory.getSugar() - sugar);
    this.inventory.setCoffee(this.inventory.getCoffee() - coffee);
  }

  public void handleOneItem(String fieldName, float valueToChange, boolean increase) {
    try {
      Method getter = Inventory.class.getMethod("get" + fieldName);
      Method setter = Inventory.class.getMethod("set" + fieldName, float.class);
      float currentValue = (float) getter.invoke(this.inventory);
      float newValue = increase ? currentValue + valueToChange : currentValue - valueToChange;

      setter.invoke(this.inventory, newValue);
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(
          "Field %s does not exists in Inventory with error %s".formatted(fieldName, e.getMessage()));
    }
  }
}
