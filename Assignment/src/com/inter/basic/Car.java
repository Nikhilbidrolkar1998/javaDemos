package com.inter.basic;

public class Car extends Vehicle implements IExternal,IInterior{
    String type;

    public Car(String brand, String model, String price, String type) {
        super(brand, model, price);
        this.type = type;
    }

    @Override
    public void showAccessories() {
        System.out.println("car accessories");
    }

    @Override
    public void exterior() {
        System.out.println("car exterior");
    }

    @Override
    public void intirior() {
        System.out.println("car interior");
    }

    @Override
    void getMileage() {
        System.out.println("car mileage");
    }
    void show(){
        System.out.println("car show");
    }
}
