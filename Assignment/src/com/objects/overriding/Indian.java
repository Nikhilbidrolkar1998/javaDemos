package com.objects.overriding;

public class Indian extends Menu{
    @Override
    void showItems(String type) {
        if(type.equals("breakfast")){
            System.out.println("1.Idli\n2.Dosa");
        } else if (type.equals("lunch")) {
            System.out.println("1.Roti sabji\n2.RiceSambar");
        }
        else {
            System.out.println("1.ice-cream\2.Juice");
        }
    }
}
