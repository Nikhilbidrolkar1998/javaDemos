package com.oops.overloading;

public class Shape {
    void calArea(int length){
        System.out.println("Sqr "+(length*length));
    }
    int calArea(int length, int breath){
        return  length*breath;
    }
    void calArea(double radius){
        System.out.println("circle "+Math.PI*Math.pow(radius,2));
    }
    double calcArea(double base, int height){
        return (0.5*base*height);
    }
}
