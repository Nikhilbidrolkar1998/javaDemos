package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemoV {
    public static void main(String[] args) {
        List<Vehicle> vehicles= Arrays.asList(new Vehicle("city","honda",23_34_000),
                new Vehicle("Hexa","Tata",43_87_000),
                new Vehicle("Santro","Hyundai",98_14_000),
                new Vehicle("A100","Audi",45_34_000),
                new Vehicle("X10","Maruti",1948784));
                for(Vehicle vehicle:vehicles){
                    System.out.println(vehicle);
                }
        Collections.sort(vehicles,new BrandSort());
        System.out.println("Sort By Brand");
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

        Collections.sort(vehicles,new ModelSort());
        System.out.println("Sort By Model");
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

        Collections.sort(vehicles,new PriceSort());
        System.out.println("Sort By Price");
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
    }
}
