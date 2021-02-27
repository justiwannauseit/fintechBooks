package com.company.fintech;

public class Book {
    String name = "default";
    String author = "default";
    int seriesISBN = 0;
    int pages = 0;

    static int countBooks = 0;

    public Book(String name, String author, int seriesISBN) {
        this.name = name;
        this.author = author;
        this.seriesISBN = seriesISBN;
        countBooks++;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        countBooks++;
    }

    public Book(String name, String author, int seriesISBN, int pages) {
        this.name = name;
        this.author = author;
        this.seriesISBN = seriesISBN;
        this.pages = pages;
        countBooks++;
    }

    public Book(String author) {
        this.author = author;
        countBooks++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", seriesISBN=" + seriesISBN +
                ", pages=" + pages +
                '}';
    }
}
