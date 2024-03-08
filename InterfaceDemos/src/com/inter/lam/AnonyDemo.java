package com.inter.lam;

public class AnonyDemo {
    public static void main(String[] args) {
        IGreeter greeter=new GreeterImpl();
        greeter.greetMessage("Welcome to Lambda");

        IGreeter greeter1=new IGreeter(){
            @Override
            public void greetMessage(String message) {
                System.out.println(message);
            }
        };
        greeter1.greetMessage("Great day");
    }
}
