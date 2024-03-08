package com.oops.bean;

public class BeanDemo {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.setBrand("tata");
        vehicle.setModel("2019");
        vehicle.setPrice(20000d);
        System.out.println(vehicle.getModel());
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getPrice());
        System.out.println(vehicle);
    }
}
