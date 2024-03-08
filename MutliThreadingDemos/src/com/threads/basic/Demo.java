package com.threads.basic;


public class Demo {
    public static void main(String[] args) {

        Runnable task=()->{
            System.out.println("Task1");
        };
        Thread thread=new Thread(task,"pop");
        Thread t=new Thread(()->{
            System.out.println("task2");
        },"jak");
        thread.start();
        t.start();
    }
}
