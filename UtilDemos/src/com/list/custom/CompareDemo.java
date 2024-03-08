package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("Java", "john", 2000),
                new Book("Spring", "Jhoo", 8000),
                new Book("Hibernate", "Alvin", 3000),
                new Book("Sql", "Ram", 7000),
                new Book("Git", "Rohan", 9000));
        System.out.println("before sorting");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("After Sorting");
        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book);
        }

    }
}
