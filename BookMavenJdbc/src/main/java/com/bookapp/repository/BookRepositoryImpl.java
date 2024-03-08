package com.bookapp.repository;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDb;
import com.bookapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class BookRepositoryImpl implements IBookRepository {
    public void addBook(Book book) {
        try(Connection connection= BookDb.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.INSERTQUERY);){
            statement.setInt(1,book.getBookId());
            statement.setString(2,book.getTitle());
            statement.setString(3,book.getAuthor());
            statement.setDouble(4,book.getPrice());
            statement.setString(5, book.getCategory());
            statement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateBook(int bookId, double price) {
        try(Connection connection= BookDb.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.UPDATEQUERY);){
            statement.setInt(1,bookId);
            statement.setDouble(2,price);
            statement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteBook(int bookId) {

    }

    public Book getById(int bookId) throws IdNotFoundException {
        return null;
    }

    public List<Book> findAll() {
        return null;
    }

    public List<Book> findByAuthor(String author) throws BookNotFoundException {
        return null;
    }

    public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
        return null;
    }

    public List<Book> findByAuthorCategory(String author, String Category) throws BookNotFoundException {
        return null;
    }
}
