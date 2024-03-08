package com.inter.extend;

public class CalculatorMain {
    public static void main(String[] args) {
        ICalculator calculator=new BasicCalculator();
        calculator.add(60,50);
        calculator.product(5,10);

        IScientific scientific=new ScintificCalc();
        scientific.cube(4);
        scientific.sub(10,5);
    }
}
