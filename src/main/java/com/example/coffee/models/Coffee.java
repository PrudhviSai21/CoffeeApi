package com.example.coffee.models;

import jakarta.persistence.*;


@Entity
@Table(name = "Coffee")
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String type;

    private int milk_quantity;
    private int water_quantity;
    private int Coffee_powder;

    public int getMilk_quantity() {
        return milk_quantity;
    }

    public void setMilk_quantity(int milk_quantity) {
        this.milk_quantity = milk_quantity;
    }

    public int getWater_quantity() {
        return water_quantity;
    }

    public void setWater_quantity(int water_quantity) {
        this.water_quantity = water_quantity;
    }

    public int getCoffee_powder() {
        return Coffee_powder;
    }

    public void setCoffee_powder(int coffee_powder) {
        Coffee_powder = coffee_powder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
