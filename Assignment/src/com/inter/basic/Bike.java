package com.inter.basic;

public class Bike extends Vehicle implements IExternal{
    String showCapacity;

    public Bike(String brand, String model, String price, String showCapacity) {
        super(brand, model, price);
        this.showCapacity = showCapacity;
    }

    @Override
    public void showAccessories() {
        System.out.println("bike accessories");
    }

    @Override
    public void exterior() {
        System.out.println("bike exterior");
    }

    @Override
    void getMileage() {
        System.out.println("bike mileage");
    }
}
