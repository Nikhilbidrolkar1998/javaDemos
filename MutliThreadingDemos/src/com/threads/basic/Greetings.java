package com.threads.basic;

public class Greetings {
    public String sayHello(String name)  {
        String result="welcome "+name;
        try {
            System.out.println("Hi "+name);
            Thread.sleep(2000);
            result="Great day "+name;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return result;
    }
}
