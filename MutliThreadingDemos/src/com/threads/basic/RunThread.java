package com.threads.basic;

import java.awt.image.RasterOp;

class Runner implements Runnable{
    String name;
    Greetings greetings;
    public Runner(String name,Greetings greetings) {

       Thread t=new Thread(this,name);
        this.name=name;
        this.greetings=greetings;
       t.start();
    }

    @Override
    public void run() {
        synchronized (greetings) {
            System.out.println(greetings.sayHello(name));
            System.out.println("done");
        }
    }
}
public class RunThread {
    public static void main(String[] args) {
//        Runner runner=new Runner("t1");
//        Thread thread1=new Thread(runner,"Thread-one");
//        Thread thread2=new Thread(runner,"Thread-two");
//        thread1.start();
//        thread2.start();
        Greetings greetings=new Greetings();
        Runner runner=new Runner("ram",greetings);
        Runner runner1=new Runner("sham",greetings);
    }
}
