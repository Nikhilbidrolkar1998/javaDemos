package com.oops.abstration;

public abstract class Branch2 extends Bank {


    @Override
    void housingLoan() {
        System.out.println("house Loan branch 2");
    }

    @Override
    void eduLoan() {
        System.out.println("Education Loan branch 2");
    }
    void loanType(){
        System.out.println("Easy Emi loans in branch 2");
    }
}
