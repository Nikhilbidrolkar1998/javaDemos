package com.inter.def;

public interface IAllowanceCalculator extends IBonusCalculator{
    @Override
    public void calculate(double amount) ;
    default void policyType(){
        System.out.println("policy for bonus");
        IBonusCalculator.super.policyType();
    }
}
