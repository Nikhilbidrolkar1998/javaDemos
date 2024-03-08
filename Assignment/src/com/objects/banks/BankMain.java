package com.objects.banks;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank(5000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your choise\n1.Deposite \n2.Withdraw");
        int choice = sc.nextInt();
        int depositeAmt = 0;
        int withdrawAmt = 0;
        switch (choice) {
            case 1:
                System.out.println("Enter amount to Deposite");
                depositeAmt = sc.nextInt();
                bank.deposit(depositeAmt);
                System.out.println(depositeAmt + " is Deposited");
                System.out.println("Total bal is " + bank.getBalance());

                break;
            case 2:
                System.out.println("Enter amount to withdraw");
                withdrawAmt = sc.nextInt();

                if (bank.balance >= withdrawAmt) {
                    bank.withdraw(withdrawAmt);
                    System.out.println(withdrawAmt + " is withdraw");
                } else {
                    System.out.println("insufficient balance");
                }
                System.out.println("Total bal is " + bank.getBalance());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
