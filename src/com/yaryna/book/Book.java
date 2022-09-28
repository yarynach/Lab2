package com.yaryna.book;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getPages() {
        return pages;
    }

    public Book() {
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int pages;
    private double price;

    public Book(int id, String name, String author, String publisher, int date, int pages, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.date = date;
        this.pages = pages;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Book" +
                "id:" + id +
                ", Name:" + name +
                ", By:" + author +
                ", Publisher:" + publisher +
                ", Year:" + date +
                ", Quantity of pages=" + pages +
                ", Price:" + price+"$";
    }
}

