package com.oops.abstration;

public class SubBranch extends Branch2 {
    @Override
    void carLoan() {
        System.out.println("car loan in sub branch");
    }
    void subPay(){
        System.out.println("payment in sub pay in sub branch");
    }
}
