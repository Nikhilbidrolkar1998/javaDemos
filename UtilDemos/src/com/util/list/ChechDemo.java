package com.util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChechDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("grapes");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("mosambi");
        fruits.add("ananas");

        List<String> aplFruit = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.startsWith("a")) {
                aplFruit.add(fruit);
            }
        }

        System.out.println("--------------");
        Iterator iterator = aplFruit.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
