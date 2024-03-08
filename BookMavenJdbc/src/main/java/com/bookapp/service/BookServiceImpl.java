package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;
import com.bookapp.repository.BookRepositoryImpl;

import java.util.List;

public class BookServiceImpl implements IBookService {
    private IBookRepository iBookRepository=new BookRepositoryImpl();
    public void addBook(Book book) {
        iBookRepository.addBook(book);
    }

    public void updateBook(int bookId, double price) {

    }

    public void deleteBook(int bookId) {

    }

    public List<Book> getAll() {
        return null;
    }

    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        return null;
    }

    public List<Book> getByCategory(String category) throws BookNotFoundException {
        return null;
    }

    public List<Book> getByPrice(double price) throws BookNotFoundException {
        return null;
    }

    public List<Book> getByAuthorContainsAndCategory(String author, String Category) throws BookNotFoundException {
        return null;
    }

    public Book getById(int bookId) throws IdNotFoundException {
        return null;
    }
}
