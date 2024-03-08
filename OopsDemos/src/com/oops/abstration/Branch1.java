package com.oops.abstration;

public class Branch1 extends Bank {
    @Override
    void carLoan() {
        System.out.println("Car Loan branch 1");
    }

    @Override
    void housingLoan() {
        System.out.println("house Loan branch 1");
    }

    @Override
    void eduLoan() {
        System.out.println("Education Loan branch 1");
    }
    void staffDetails(){
        System.out.println("Staff in branch 1");
    }
}
