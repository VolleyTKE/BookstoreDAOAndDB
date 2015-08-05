/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.controller;

import com.bookstore.dao.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.bookstore.model.Book;

public class BookController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/book.jsp";
    private static String LIST_BOOK = "/listBook.jsp";
    private BookDAO dao;

    public BookController() {
        super();
        dao = new BookDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int bookid = Integer.parseInt(request.getParameter("bookid"));
            dao.deleteBook(bookid);
            forward = LIST_BOOK;
            request.setAttribute("book", dao.getAllBooks());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int bookid = Integer.parseInt(request.getParameter("bookid"));
            Book book = dao.getBookById(bookid);
            request.setAttribute("book", book);
        } else if (action.equalsIgnoreCase("listBook")){
            forward = LIST_BOOK;
            request.setAttribute("book", dao.getAllBooks());
            
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book book = new Book();
        book.setYearpub(Integer.parseInt(request.getParameter("yearpub")));
        book.setTitle(request.getParameter("title"));
        book.setAuthor(request.getParameter("author"));
        book.setPrice(Float.parseFloat(request.getParameter("price")));
        book.setQuantity(Integer.parseInt(request.getParameter("quantity")));
        
        String bookid = request.getParameter("bookid");
        if(bookid == null || bookid.isEmpty())
        {
            dao.addBook(book);
        }
        else
        {
            book.setBookid(Integer.parseInt(bookid));
            dao.updateBook(book);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_BOOK);
        request.setAttribute("book", dao.getAllBooks());
        view.forward(request, response);
    }
}