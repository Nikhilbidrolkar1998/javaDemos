package com.inter.def;

public interface IBonusCalculator {
    void calculate(double amount);
    default void policyType(){
        System.out.println("policy for bonus");
    }
    static void show(){
        System.out.println("Show the data");
    }
}
