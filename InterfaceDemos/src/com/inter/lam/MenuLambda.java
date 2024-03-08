package com.inter.lam;

public class MenuLambda {
    public static void main(String[] args) {
        IMenu menu=()-> System.out.println("Chinese\n 1.noodles\n 2.Gobi");
        menu.shoeMenu();

        menu=()-> System.out.println("Indian\n 1.Idli \n 2.Samosa");
        menu.shoeMenu();

        menu=()-> System.out.println("Italian\n 1.friedRice\n 2.Chan's");
        menu.shoeMenu();
    }
}
