package com.inter.lam;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory factory=new ShapeFactory();

        IShape shape=new Rectangle();
        factory.printArea(shape,10,20);

        factory.printArea(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("calculating area");
                System.out.println("Tri "+(x*y*0.5));
            }
        },10,30);

        System.out.println("------------------------");
        factory.printArea((x,y)->{
            System.out.println("calculating sq area");
            System.out.println("sq "+(x*x));
        },2,4);

    }
}
