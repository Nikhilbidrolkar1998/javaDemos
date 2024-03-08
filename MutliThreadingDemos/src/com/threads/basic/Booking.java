package com.threads.basic;

public class Booking {
    public double bookTickets(String name,int noOfTickets){
        double costPerTicket=200;
        System.out.println("booked for "+name);
        double totalPrice=costPerTicket*noOfTickets;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total "+totalPrice);
        return totalPrice;
    }
}
