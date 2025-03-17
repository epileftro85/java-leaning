package com.anclasoft.models;

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

    public void setWater(float water) {
        this.water = water;
    }

    public float getSugar() {
        return sugar;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    public float getCoffee() {
        return coffee;
    }

    public void setCoffee(float coffee) {
        this.coffee = coffee;
    }

    public float getMilk() {
        return milk;
    }

    public void setMilk(float milk) {
        this.milk = milk;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
