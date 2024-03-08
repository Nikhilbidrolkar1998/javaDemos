package com.inter.lam;

public class ShapeDemo implements IShape {
    public static void main(String[] args) {
        IShape shape=new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println(x*y);
            }
        };
        shape.area(5,4);
       IShape shape1=new IShape() {
           @Override
           public void area(int x, int y) {
               System.out.println(2*x*y);
           }
       };
       shape1.area(1,2);

    }
    @Override
    public void area(int x, int y) {
        System.out.println(2*x*y);
    }
}
