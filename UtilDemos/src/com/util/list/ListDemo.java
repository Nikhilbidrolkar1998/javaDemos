package com.util.list;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        System.out.println(list.size());
        list.add("java");
        list.add("100.0");
        list.add("Spring");
        list.add("Angular");
        list.add("maven");
        list.add("helen");
        System.out.println(list);
        list.set(2,"priya");
        System.out.println(list.size());

        Iterator<String> iterator=list.listIterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            System.out.println(str);
        }

        System.out.println("-----------");
        System.out.println("Sorting the list");
        Collections.sort(list);
        for (String val:list)
        {
            System.out.println(val.toUpperCase());
        }
    }
}
