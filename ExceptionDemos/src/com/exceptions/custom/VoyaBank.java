package com.exceptions.custom;

public class VoyaBank {
    double balance;

    public VoyaBank(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) throws OutOfLimitsException,NegativeBalanceException{
        System.out.println("In withdrawn method");
        try{
            if(balance-amount<=0)
                throw new NegativeBalanceException("balance is nagative");
            if(amount>1000)
                throw new OutOfLimitsException("limit Exceeded");
            balance=balance=amount;
            System.out.println("balance "+balance);
        }catch (NegativeBalanceException e){
            System.out.println("Exception.."+e.getMessage());
            throw e;
        }catch (OutOfLimitsException e){
            System.out.println("Exception.."+e.getMessage());
            throw e;
        }finally {
            System.out.println("close db");
        }
        System.out.println("work done");
    }
}
