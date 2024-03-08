package com.oops.stat;

public class DemoNew {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("main demo");
        try{
            Class.forName("com.oops.stat.Demo");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Demo.getMessage();
        System.out.println();
    }
}
