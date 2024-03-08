package com.list.custom;

import java.util.*;

public class BookDemo {
    public static void main(String[] args) {
        List<Book> books= Arrays.asList(new Book("java","katly",90),
                new Book("Spring", "Jhoo", 8000),
                new Book("Hibernate", "Alvin", 3000),
                new Book("Sql", "Ram", 7000),
                new Book("Git", "Rohan", 9000),
                new Book("Git", "Rohan", 9000));

        for(Book book:books){
            System.out.println(book);
        }
        Set<Book> newbook=new TreeSet<>(books);
        System.out.println("-------------------");
        for(Book book:books){
            System.out.println(book);
        }


    }

}
