package com.inter.basics;

public class DeveloperDetails implements IEntertainment {
    @Override
    public void showGames(String type) {
        if(type.equals("indoor"))
            System.out.println("Shuttle and mma available");
        else
            System.out.println("Cricket");
    }

    @Override
    public void showActivity() {
        System.out.println("weekly lunch outing");
    }
}
