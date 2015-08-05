/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.dao;

import com.bookstore.model.*;
import com.bookstore.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chris
 */
public class BookDAO {
    
    private Connection connection;

    public BookDAO() {
        connection = DbUtil.getConnection();
    }

    public void addBook(Book book) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into books (yearpub, title, author, price, quantity) values (?, ?, ?, ?, ?)");
            
            // Parameters start with 1
            
            preparedStatement.setInt(1, book.getYearpub());
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.setString(3, book.getAuthor());
            preparedStatement.setFloat(4, book.getPrice());
            preparedStatement.setInt(5, book.getQuantity());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(int bookid) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from books where bookid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, bookid);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBook(Book book) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update books set yearpub=?, title=?, " +
                            "author=?, price=?, quantity=? " +
                            "where bookid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, book.getYearpub());
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.setString(3, book.getAuthor());
            preparedStatement.setFloat(4, book.getPrice());
            preparedStatement.setInt(5, book.getQuantity());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<Book>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from books");
            while (rs.next()) {
                Book book = new Book();
                book.setBookid(rs.getInt("bookid"));
                book.setYearpub(rs.getInt("yearpub"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPrice(rs.getFloat("price"));
                book.setQuantity(rs.getInt("quantity"));
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    public Book getBookById(int bookid) {
        Book book = new Book();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from books where bookid=?");
            preparedStatement.setInt(1, bookid);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                book.setBookid(rs.getInt("bookid"));
                book.setYearpub(rs.getInt("yearpub"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPrice(rs.getFloat("price"));
                book.setQuantity(rs.getInt("quantity"));
               
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return book;
    }
}
