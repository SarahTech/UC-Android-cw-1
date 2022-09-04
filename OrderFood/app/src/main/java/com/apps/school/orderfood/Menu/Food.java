package com.apps.school.orderfood.Menu;

import java.io.Serializable;

public class Food implements Serializable {

    private String name;
    private String description;
    private double price;
    private int picture;

    public Food() {
    }

    public Food(String name, String description, double price, int picture) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
