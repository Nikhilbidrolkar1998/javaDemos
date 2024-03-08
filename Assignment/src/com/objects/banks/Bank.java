package com.objects.banks;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }
    void deposit(double amount){
        balance+=amount;
    }
    void withdraw(double amount){ balance-=amount; }
    double getBalance(){
        return balance;
    }
}
