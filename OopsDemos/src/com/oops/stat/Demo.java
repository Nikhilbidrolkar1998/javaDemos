package com.oops.stat;

public class Demo {
    static int x;
    static int y=10;
    static {
        System.out.println("In static block one");
        x=200;
    }
    static {
        System.out.println("In static block 2");
        x=200;
    }
    static void getMessage(){
        System.out.println("in static method");
        System.out.println("sum "+(x+y));
    }

    public static void main(String[] args) {
        System.out.println("in main");
        getMessage();
        System.out.println("sum "+(x+y));
    }
}
