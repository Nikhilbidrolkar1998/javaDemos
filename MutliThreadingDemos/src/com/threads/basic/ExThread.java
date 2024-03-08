package com.threads.basic;

class Child extends Thread{
    public Child(String name,int priority){
        super(name);
        System.out.println(this);
       // this.start();
    }
    @Override
    public void run(){

        for(int i=1;i<=10;i++){
            String name=Thread.currentThread().getName();
            System.out.println("5*"+i+"="+(5*i)+" "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ExThread {
    public static void main(String[] args) {
 //       Child child1=new Child("ChildOne",10);
//        child1.setName("ChildOne");
//        System.out.println(child1);
//        child1.start();

        Child child2=new Child("ChildTwo",6);
//        child2.setName("ChildTwo");
//        System.out.println(child2);
//        child2.start();

        Child child3=new Child("Childthree",6);
        child2.setDaemon(true);
        child2.start();
        for(int i=1;i<=10;i++){
            String name=Thread.currentThread().getName();
            System.out.println("5*"+i+"="+(5*i)+" "+name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

//        try {
//            child1.join();
//            child2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("main completed");
    }
}
