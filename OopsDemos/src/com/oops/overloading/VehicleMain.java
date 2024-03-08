package com.oops.overloading;

import com.oops.overloading.Vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Vehicle vehicle1=new Vehicle("Tata");
        Vehicle vehicle2=new Vehicle("2019",6000);
        Vehicle vehicle3=new Vehicle("2000",90000,"Maruthi");

        vehicle.getDetails();
        System.out.println("-------------");
        vehicle1.getDetails();
        System.out.println("-------------");
        vehicle2.getDetails();
        System.out.println("-------------");
        vehicle3.getDetails();
    }
}
