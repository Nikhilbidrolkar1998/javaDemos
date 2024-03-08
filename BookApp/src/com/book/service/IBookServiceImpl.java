package com.book.service;

import com.book.exception.BookNotFoundException;
import com.book.exception.IdNotFoundException;
import com.book.model.Book;
import com.book.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class IBookServiceImpl implements IBookService {

    @Override
    public List<Book> getAll() {
        List<Book> books= BookDetails.showBooks();
        return books;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> newBook=new ArrayList<>();
        for(Book book:books){
            if(book.getAuthor().startsWith(author)){
                newBook.add(book);
            }
        }
        if(newBook.isEmpty()){
            throw new BookNotFoundException("Book by this author Not Found");
        }
        return newBook;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> newBook=new ArrayList<>();
        for(Book book:books){
            if(book.getCategory().equals(category)){
                newBook.add(book);
            }
        }
        if(newBook.isEmpty()){
            throw new BookNotFoundException("Book by this categoryNot Found");
        }
        return newBook;
    }

    @Override
    public List<Book> getByPrice(double price) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> newBook=new ArrayList<>();
        for(Book book:books){
            if(book.getPrice()<=price){
                newBook.add(book);
            }
        }
        if(newBook.isEmpty()){
            throw new BookNotFoundException("book not found in this price");
        }
        return newBook;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks();
        List<Book> newBook=new ArrayList<>();
        for(Book book:books){
            if(book.getAuthor().equals(author) && book.getCategory().equals(category) ){
                newBook.add(book);
            }
        }
        if(newBook.isEmpty()){
            throw new BookNotFoundException("not found");
        }
        return newBook;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        List<Book> books= BookDetails.showBooks();
        for(Book book:books){
            if(book.getBookId()==bookId){
                return book;
            }
        }
        throw new IdNotFoundException("Id not found");
    }
}
