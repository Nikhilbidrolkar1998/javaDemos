package com.oops.overloading;

public class OverloadMain {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.calArea(10);
        shape.calArea(2.0);
        int rect = (int) shape.calArea(10,20);
        System.out.println("Rect "+rect);
        double tri = shape.calcArea(2.0f,10);
        System.out.println("Tri "+tri);
  }
}
