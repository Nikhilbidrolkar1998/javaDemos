package com.objects.basics;

public class BookMain {
    public static void main(String[] args) {
        Book book=new Book("Java","Nikhil",9000, "tech");
        Book book1=new Book("Sql","Raju",800, "tech");
        Book book2=new Book("Spring","Sneha",300, "tech");

        book.getDetails();
        book1.getDetails();

        book.checkBookType();
    }
}
