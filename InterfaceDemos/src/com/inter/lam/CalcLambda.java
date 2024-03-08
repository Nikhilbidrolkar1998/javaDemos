package com.inter.lam;

public class CalcLambda{
    public static void main(String[] args) {
        IMyCalculator calculator1=(x,y)->x+y;
        System.out.println("addition is "+calculator1.calculator(4,5));

        calculator1=(x,y)->x-y;
        System.out.println("Subtraction "+calculator1.calculator(9,3));

        calculator1=(x,y)->x*y;
        System.out.println("product "+calculator1.calculator(3,3));

        calculator1=(x,y)->x/y;
        System.out.println("Division "+calculator1.calculator(80,3));

    }
}
