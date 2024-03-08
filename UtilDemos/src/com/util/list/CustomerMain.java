package com.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nikhil", 1, "Dharwad"));
        customers.add(new Customer("Priya", 2, "bangalore"));
        customers.add(new Customer("Sandhya", 3, "goa"));
        customers.add(new Customer("Kavya", 4, "bangalore"));
        customers.add(new Customer("Aryan", 5, "Gadag"));
        customers.add(new Customer("Rajawali", 7, "Dharwad"));
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        List<Customer> bangaloreCustomers = new ArrayList<>();
        System.out.println("bangalore customers");
        for (Customer customer : customers) {
            if (customer.getCity().equals("bangalore")) {
                bangaloreCustomers.add(customer);
            }
        }

        for (Customer customer : bangaloreCustomers) {
            System.out.println(customer);
        }

    }
}
