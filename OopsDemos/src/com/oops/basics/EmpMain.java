package com.oops.basics;

public class EmpMain {
    public static void main(String[] args) {
        System.out.println("welcome");
        Employee employee=new Employee("Nikhil",101,20000);
        employee.getDetails();
        System.out.println(employee.greet("Good Morning "));
    }
}
