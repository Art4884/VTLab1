package com.company;

import java.util.Objects;

public class ProgrammerBook extends Book{

    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price,int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)){
            return false;
        }
        if (getClass() != o.getClass()){
            return false;
        }
        ProgrammerBook pBook = (ProgrammerBook) o;
        return level == pBook.level && language.equals(pBook.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return "Programmer book:\nLanguage: " + language + "\nLevel: " + level;
    }
}