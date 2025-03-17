package com.ancla.models;

public class Inventory {
  private float water;
  private float sugar;
  private float coffee;
  private float milk;
  private float money;

  public Inventory(float water, float sugar, float coffee, float milk, float money) {
    this.water = water;
    this.sugar = sugar;
    this.coffee = coffee;
    this.milk = milk;
    this.money = money;
  }

  public float getWater() {
    return water;
  }

  public float getSugar() {
    return sugar;
  }

  public float getCoffee() {
    return coffee;
  }

  public float getMilk() {
    return milk;
  }

  public float getMoney() {
    return money;
  }

  public void setWater(float water) {
    this.water = water;
  }

  public void setSugar(float sugar) {
    this.sugar = sugar;
  }

  public void setCoffee(float coffee) {
    this.coffee = coffee;
  }

  public void setMilk(float milk) {
    this.milk = milk;
  }

  public void setMoney(float money) {
    this.money = money;
  }
}
