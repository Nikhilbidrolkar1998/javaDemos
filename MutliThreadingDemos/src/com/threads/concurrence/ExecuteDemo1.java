package com.threads.concurrence;

import com.threads.basic.Booking;
import com.threads.basic.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        executorService.execute(()->{
            System.out.println("Doing pollling");
            Greetings greetings=new Greetings();
            System.out.println(greetings.sayHello("Priya"));
        });

        executorService= Executors.newFixedThreadPool(10);
        executorService.execute(()->{
            System.out.println("Extracting name from url");
            Booking booking=new Booking();
            booking.bookTickets("Raju",2);
        });

        executorService= Executors.newFixedThreadPool(10);
        executorService.execute(()->{
            System.out.println("Reading from db");
        });
    }
}
