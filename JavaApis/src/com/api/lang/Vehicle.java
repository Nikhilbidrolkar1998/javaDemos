package com.api.lang;

import java.util.Objects;

public class Vehicle {
    private String brand;
    private String model;
    private String colour;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, colour);
    }

    public Vehicle(String brand, String model, String colour) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
