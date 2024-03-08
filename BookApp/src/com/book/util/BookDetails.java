package com.book.util;

import com.book.model.Book;

import java.util.Arrays;
import java.util.List;

public class BookDetails {
    public static List<Book> showBooks(){
        return Arrays.asList(
                new Book("Java in action","John David","Tech",1,900.90),
                new Book("5am club","Robin Sharma","selfhelp",2,450.00),
                new Book("2 States","John Hoppper","Love Story",3,1000),
                new Book("Peace of mind","Sandhya","selfhelp",3,1280),
                new Book("Seven habits","John Hoppper","selfhelp",4,800)
        );
    }
}
