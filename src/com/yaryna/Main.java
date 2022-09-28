/**
 * package with all materials
 */
package com.yaryna;
import com.yaryna.book.Book;

import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array you want to input:");
        int size = scan.nextInt();
        Book[] books = CreateArr(size);
        PrintByAuthor(books);
        PrintByPublisher(books);
        PrintByYear(books);


    }

    /**
     * Method that create array of class Book
     * and check input
     * @param size of array
     * @return array of the class BooK
     */
    public static Book[] CreateArr(int size) {
        Book[] arr = new Book[size];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i]= new Book();
            //id for a book
            System.out.println("Enter id of book:");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number!");
                scan.next(); // this is important!
            }
            arr[i].setId(scan.nextInt());
            // name of book
            System.out.println("Enter name of the book:");
            arr[i].setName(scan.nextLine());
            scan.nextLine();
            System.out.println("Enter author of the book:");
            arr[i].setAuthor(scan.nextLine());

            System.out.println("Enter publisher of the book:");
            arr[i].setPublisher(scan.nextLine());

            System.out.println("Enter year of the book:");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a year!");
                scan.next(); // this is important!
            }
            arr[i].setDate(scan.nextInt());

            System.out.println("Enter quantity of pages of the book:");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number!");
                scan.next(); // this is important!
            }
            arr[i].setPages(scan.nextInt());



            System.out.println("Enter price of the book:");
             while (!scan.hasNextInt()) {
                System.out.println("That's not a number!");
                scan.next(); // this is important!
             }
            arr[i].setPrice(scan.nextDouble());
    }
        return arr;
    }

    /**
     * Method that show us books of
     * the certain author
     * @param arr array of the clas Book
     */
    public static void PrintByAuthor(Book[] arr){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of the author to get books:");
        String name = scan.nextLine();
        for (Book i : arr){
            if (Objects.equals(i.getAuthor(), name)){
                System.out.println(i);
            }
        }
    }

    /**
     * Method that show the book of the specific publisher
     * @param arr array of the class Book
     */
    public static void PrintByPublisher(Book[] arr){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of the publisher to get books:");
        String publisher = scan.nextLine();
        for (Book i : arr){
            if (Objects.equals(i.getPublisher(), publisher)){
                System.out.println(i);
            }
        }
    }

    /**
     * Method that show us book with the year bigger than user input
     * @param arr array of the class Book
     */
    public static void PrintByYear(Book[] arr){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year to see books published after that year:");
        int year = scan.nextInt();
        for (Book i : arr){
            if (i.getDate()>year){
                System.out.println(i);
            }
        }
    }
}
