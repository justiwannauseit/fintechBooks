package com.company.fintech;

import java.util.Random;

public class Reader {

    private final Random random = new Random();

    public Book choiceBook(Book[] booksInLibrary) {
        return booksInLibrary[random.nextInt(Book.countBooks)];
    }

    public void readBook(Book randomBook) {
        System.out.println("Читатель прочитал случайную книгу:");
        System.out.println(randomBook.toString());
    }

    public int getRating(Book randomBook) {
        int rating;
        int ratingName;
        int ratingAuthor;
        int ratingSeriesISBN;
        int ratingPages;

        if (randomBook.name.equals("default")) {
            ratingName = random.nextInt(10);
        } else ratingName = randomBook.name.replaceAll(" ", "").length();

        if (randomBook.author.equals("default")) {
            ratingAuthor = random.nextInt(10);
        } else ratingAuthor = randomBook.author.replaceAll(" ", "").length();

        if (randomBook.seriesISBN == 0) {
            ratingSeriesISBN = random.nextInt(10);
        } else ratingSeriesISBN = randomBook.seriesISBN;

        if (randomBook.pages == 0) {
            ratingPages = random.nextInt(10);
        } else ratingPages = randomBook.pages;

        rating = ratingName + ratingAuthor - ratingSeriesISBN + ratingPages;

        return rating;
    }

}
