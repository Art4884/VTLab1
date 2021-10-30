package com.company;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Book.setEdition(1);
	    Book book1 = new Book("Fantastic Beasts", "Rowling", 20, 1);
        Book book2 = new Book("Mifodiy", "Author", 10, 2);
        Book book3 = new Book("Dune", "Author2", 30, 3);


        TreeSet<Book> shelf = new TreeSet<>();
        shelf.add(book2);
        shelf.add(book3);
        shelf.add(book1);
        for(Book book : shelf){
            System.out.println(book);
        }

        System.out.println("#Original-------------------------------------------------------------");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book3);
        bookList.add(book1);
        bookList.add(book2);
        for(Book book : bookList){
            System.out.println(book);
        }

        System.out.println("#ByName----------------------------------------------------------------");
        NameComparator byName = new NameComparator();
        bookList.sort(byName);
        for(Book book : bookList){
            System.out.println(book);
        }

        System.out.println("#ByAuthor---------------------------------------------------------------");
        AuthorComparator byAuthor = new AuthorComparator();
        bookList.sort(byAuthor);
        for(Book book : bookList){
            System.out.println(book);
        }

        System.out.println("#ByPrice-----------------------------------------------------------------");
        PriceComparator byPrice = new PriceComparator();
        bookList.sort(byPrice);
        for(Book book : bookList){
            System.out.println(book);
        }
    }
}
