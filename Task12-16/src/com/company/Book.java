package com.company;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || object.getClass() != getClass()){
            return false;
        }
        Book book = (Book) object;
        return price == book.price && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, edition);
    }

    @Override
    public String toString() {
        return  "Book:\ntitle: " + title + "\nauthor: " + author + "\nprice: " + price + "\nedition: " + edition;
    }

    @Override
    public Object clone() {
        return new Book(title, author, price, isbn);
    }

    @Override
    public int compareTo(Book book) {
        if(this.isbn == book.getIsbn()){
            return 0;
        }else if(this.isbn < book.getIsbn()){
            return -1;
        }else{
            return 1;
        }
    }
}
