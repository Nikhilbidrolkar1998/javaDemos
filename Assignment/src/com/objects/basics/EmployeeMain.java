package com.objects.basics;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee[] empList=new Employee[3];
        for(int i=0;i<=3;i++);
        {
            System.out.println("enter Name");
            String name = sc.next();
            System.out.println("enter Designation");
            String designation = sc.next();
            //empList[i] = new Employee(name, designation);
        }
        System.out.println("Enter designation");
        String ch=sc.next();
        for (Employee emp:empList){
            if(ch.equals("programmer"))
            {
                System.out.println(emp.calBonus(2000));;
            }
            else if(ch.equals("manager")){
                System.out.println(emp.calBonus(2200,220,"car"));;
             }
            else
            {
                System.out.println(emp.calBonus(3000,"laptop",4000,3000));;
            }
        }

    }
}
