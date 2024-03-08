package com.exceptions.basics;

public class Atm {
    public static void main(String[] args) {
        System.out.println("in ATM");
        Bank bank=new Bank();
        try{
            bank.withdraw(10);
            System.out.println("amt withdrawn");

        }catch (Exception e){
            System.out.println("exception....");
            System.out.println(e.getMessage());
        }
        System.out.println("goodbye");
    }
}
