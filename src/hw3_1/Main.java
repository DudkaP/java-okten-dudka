package hw3_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();
        books.add("book-1");
        books.add("book-2");
        books.add("book-3");

        Book book = new Book();
        book.print(books);

        System.out.println("---------------------------------");

        ArrayList<String> magazines = new ArrayList<>();
        magazines.add("magazine-1");
        magazines.add("magazine-2");
        magazines.add("magazine-3");

        Magazine magazine = new Magazine();
        magazine.print(magazines);

    }

}
