package com.objects.overriding;

public class Chinese extends Menu{
    @Override
    void showItems(String type) {
        if(type.equals("starters")){
            System.out.println("1.Finger chips\n2.Gobi");
        } else if (type.equals("lunch")) {
            System.out.println("1.Fish Thali\n2.RiceSambar");
        }
        else {
            System.out.println("1.ice-cream\2.Juice");
        }
    }
    void printGames(){
        System.out.println("cricket\n football");
    }
}
