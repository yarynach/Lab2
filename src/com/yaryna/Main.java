package com.yaryna;
import com.yaryna.book.Book;

import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String args[]){

        Book book1 = new Book(1,"Harry Potter","J.K.Rowling","ABABAHALAMAHA",2002,323,200);
        Book book2 = new Book(2,"Internat","S.Zhadan","KSD",2021,323,300);


       Book[] books = CreateArr(2);
       //PrintByAuthor(books);
      // PrintByPublisher(books);
        PrintByYear(books);


    }
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
