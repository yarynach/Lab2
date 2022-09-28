/**
 * package that consists of Book class
 */
package com.yaryna.book;

/**
 * Class, that describes book
 * @author Yaryna Chernysh
 * @version 1.0
 */
public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int date;
    private int pages;
    private double price;

    /**
     *
     * @return the id of the book
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id of the book
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return name of the book
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name of the book
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @param author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     * @return publisher of the book
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     *
     * @param publisher publisher of book
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     *
     * @return year of publishing
     */
    public int getDate() {
        return date;
    }

    /**
     *
     * @param date is the year of publishing
     */

    public void setDate(int date) {
        this.date = date;
    }

    /**
     *
     * @return quantity of pages
     */
    public int getPages() {
        return pages;
    }



    /**
     *
     * @param pages of the book
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     *
     * @param price price of the book
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return price of the book in dollars
     */
    public double getPrice() {
        return price;
    }
    /**
     * Constructor without parametres
     */
    public Book() {
    }

    /**
     *
     * @param id - id of the book
     * @param name - name of the book
     * @param author - initials of the book
     * @param publisher - publisher
     * @param date - year of publishing
     * @param pages - quantity of pages
     * @param price - price of the book
     */
    public Book(int id, String name, String author, String publisher, int date, int pages, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.date = date;
        this.pages = pages;
        this.price = price;
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

