/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.model;

/**
 *
 * @author Chris
 */
public class Book {
    private int bookid;
    private int yearpub;
    private String title;
    private String author;
    private float price;
    private int quantity;
    


    
   
    @Override
    public String toString(){
        return "Book [bookid=" + getBookid() + ", yearpublished="
                + getYearpub() + ", title=" + getTitle() + ", author=" + getAuthor() 
                + ", price=" + getPrice() + ", quantity=" + getQuantity() +"]";
    }

    /**
     * @return the bookid
     */
    public int getBookid() {
        return bookid;
    }

    /**
     * @param bookid the bookid to set
     */
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    /**
     * @return the yearpub
     */
    public int getYearpub() {
        return yearpub;
    }

    /**
     * @param yearpub the yearpub to set
     */
    public void setYearpub(int yearpub) {
        this.yearpub = yearpub;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
