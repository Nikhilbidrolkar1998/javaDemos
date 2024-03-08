package com.inter.def;

import com.inter.def.IBonusCalculator;

public class CalculatorImpl implements IBonusCalculator,IAllowanceCalculator {
    @Override
    public void calculate(double amount) {
        System.out.println("Amount sum is "+(amount+amount));
    }
    @Override
    public void policyType(){
        System.out.println("policy type for All Employees");

    }
}
