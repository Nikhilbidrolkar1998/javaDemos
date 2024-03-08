package com.objects.basics;

public class Employee {
    String name;
    String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    double calBonus(double basicAllowance){
        return basicAllowance;
    }
    double calBonus(double basicAllowance,double houseAllowance, String gift){
        System.out.println("Gift is "+gift);
        return  basicAllowance+houseAllowance;
    }
    double calBonus(double basicAllowance, String gift, double carAllowance, double houseAllowance){
        System.out.println("Gift is "+gift);
        return  basicAllowance+carAllowance+houseAllowance;
    }

}
