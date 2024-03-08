package com.exceptions.custom;

public class VoyaAtm {
    public static void main(String[] args) {
        System.out.println("in atm");
        VoyaBank bank=new VoyaBank(2000);
        try {
            bank.withdraw(9000);
        } catch (NegativeBalanceException e){
            System.out.println(e.getMessage());
        }catch (OutOfLimitsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("goodbye");
    }
}
