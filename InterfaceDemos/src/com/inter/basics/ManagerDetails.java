package com.inter.basics;

public class ManagerDetails implements IEntertainment {
    @Override
    public void showGames(String type) {
        if(type.equals("indoor"))
            System.out.println("chess and carrom available");
        else
            System.out.println("football");
    }

    @Override
    public void showActivity() {
        System.out.println(" monthly dinner");
    }
}
