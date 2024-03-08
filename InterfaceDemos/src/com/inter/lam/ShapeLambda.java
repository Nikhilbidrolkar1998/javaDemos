package com.inter.lam;

public class ShapeLambda {
    public static void main(String[] args) {
        IShape shape=(x,y)->System.out.println("Rect "+(x*y));
        shape.area(1,2);
        shape=(x,y)-> System.out.println("Trim "+(0.5*x*y));
        shape.area(10,20);
        shape=(x,y)-> System.out.println(2*(x+y));
        shape.area(100,200);
        shape=(x,y)-> System.out.println((x*y)/2);
        shape.area(20,30);

    }
}
