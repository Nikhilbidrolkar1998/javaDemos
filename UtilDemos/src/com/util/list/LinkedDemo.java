package com.util.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.SortedMap;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("java");
        list.add("SSping");
        list.add("node");
        list.add("angular");
        list.add("maven");
        System.out.println(list);
        list.addFirst("Css");
        list.addLast("react");
        list.set(1,"Html");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
