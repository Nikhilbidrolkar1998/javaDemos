package com.inter.basic;

public abstract class Vehicle implements IInsurance{
    String brand;
    String model;
    String price;

    public Vehicle(String brand, String model, String price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void getDetails(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
    abstract void getMileage();

    @Override
    public void insuranceDetails() {
        System.out.println("vehicle insurance");
    }
}
