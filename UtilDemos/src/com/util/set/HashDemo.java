package com.util.set;

import java.util.*;

public class HashDemo {
    public static void main(String[] args) {
//        Set<String> hashSet=new HashSet<>();
//        Set<String > hashSet=new LinkedHashSet<>();
        Set<String> hashSet=new TreeSet<>();
        hashSet.add("apple");
        hashSet.add("Pineapple");
        hashSet.add("orange");
        hashSet.add("Banana");
        hashSet.add("Kiwi");
        hashSet.add("100");
//        hashSet.add(null);



        System.out.println(hashSet);
        System.out.println(hashSet);
        for(String element : hashSet){
            System.out.println(element);
        }

        List<String> fruits1=Arrays.asList("mango","peru","orange");
        Set<String> newfruits=new HashSet<>(fruits1);
        System.out.println(newfruits);
    }
}
