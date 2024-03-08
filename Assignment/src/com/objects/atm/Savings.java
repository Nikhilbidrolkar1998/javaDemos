package com.objects.atm;

public class Savings extends Account {
    public Savings(double balance) {
        super(balance);
    }
    @Override
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount is deposited to Savings");
        }
        else{
            System.out.println("invalid amount");
        }
    }

    @Override
    void withdraw(double amount){

    }
}
