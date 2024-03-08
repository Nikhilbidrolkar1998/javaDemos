package com.inter.lam;

public class ShapeFactory {
    void printArea(IShape shape,int x,int y){
        System.out.println("printing area");
        shape.area(x,y);
        System.out.println("completed");
    }
}
