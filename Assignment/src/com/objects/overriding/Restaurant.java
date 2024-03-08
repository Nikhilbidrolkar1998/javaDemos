package com.objects.overriding;

public class Restaurant {
    public static void main(String[] args) {
        Menu menu= new Chinese();
        menu.showItems("starters");
        Chinese chinese=(Chinese)menu;
        chinese.printGames();
        System.out.println("-----------");
        menu=(Menu)new Indian();
        menu.showItems("breakfast");
    }
}
