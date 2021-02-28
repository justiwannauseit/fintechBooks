package com.company.fintech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Book warAndPeace = new Book("Война и мир", "Лев Толстой");
        Book crimeAndPunishment = new Book("Преступление и накозание", "Федор Достаевский", 1);
        Book harryPotter = new Book("Гарри Поттер gold edition", "Joanne Rowling", 8, 1000);
        Book atTheBottom = new Book("Максим Горький");

        Book[] booksInLibrary = {warAndPeace, crimeAndPunishment, harryPotter, atTheBottom};

        Reader reader = new Reader();
        Book randomBook = reader.choiceBook(booksInLibrary);
        System.out.println("Из всех имеющихся книг:\n" + Arrays.toString(booksInLibrary) + "\n");
        reader.readBook(randomBook);
        System.out.println("Читатель поставил оценку: " + reader.getRating(randomBook));
    }
}
