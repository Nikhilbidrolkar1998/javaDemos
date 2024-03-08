package com.inter.extend;

public class ScintificCalc extends BasicCalculator implements IScientific {

    @Override
    public void square(int x) {
        System.out.println(2*x);
    }

    @Override
    public void cube(int x) {
        System.out.println(x*x);
    }
}
