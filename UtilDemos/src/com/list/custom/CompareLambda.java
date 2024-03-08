package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {
        List<Vehicle> vehicles= Arrays.asList(new Vehicle("city","Honda",23_34_000),
                new Vehicle("Hexa","Tata",43_87_000),
                new Vehicle("Santro","Hyundai",98_14_000),
                new Vehicle("A100","Audi",45_34_000),
                new Vehicle("X10","Maruti",1948784));
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

        System.out.println("brand sort");
        Collections.sort(vehicles, (o1, o2)-> o1.getBrand().compareTo(o2.getBrand()));
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

        System.out.println("Price sort");
        Collections.sort(vehicles, (o1, o2)-> ((Double)o1.getPrice()).compareTo(o2.getPrice()));
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
    }
}
