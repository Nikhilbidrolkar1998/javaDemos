package com.inter.lam;

public class UserMain {
    public static void main(String[] args) {
        Waiter waiter=new Waiter();
        waiter.availableItems((new IMenu() {
            @Override
            public void shoeMenu() {
                System.out.println("idly");
                System.out.println("dosa");
                System.out.println("gobi");
                System.out.println("puri");
            }
        }));
    }
}
