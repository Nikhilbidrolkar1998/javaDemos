package com.book.client;

import com.book.exception.BookNotFoundException;
import com.book.model.Book;
import com.book.service.IBookService;
import com.book.service.IBookServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book category to find books");
        String userCategory=sc.next();
        IBookService bookService=new IBookServiceImpl();
        List<Book> booksBycategory;
         try{
             booksBycategory = bookService.getByCategory(userCategory);
             for (Book book:booksBycategory){
                 System.out.println(book);
             }
         }catch (BookNotFoundException e){
             e.printStackTrace();
         }
         //__________________________________________________________
        System.out.println("Find Books by Author");
        String userInputAuthor=sc.next();
        List<Book> booksByAuthor;
        try{
            booksByAuthor = bookService.getByAuthorStartsWith(userInputAuthor);
            for (Book book:booksByAuthor){
                System.out.println(book);
            }
        }catch (BookNotFoundException e){
            e.printStackTrace();
        }
        //-------------------------------------------------------


    }
}
