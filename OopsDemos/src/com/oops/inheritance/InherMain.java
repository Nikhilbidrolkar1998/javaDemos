package com.oops.inheritance;

public class InherMain {
    public static void main(String[] args) {
        InEmployee inEmployee=new InEmployee("Rahul",55);
        inEmployee.getDetails();

        InManager inManager=new InManager("Venki",90,45000);
        inManager.getDetails();
        inManager.printBonus((1000));
    }
}
