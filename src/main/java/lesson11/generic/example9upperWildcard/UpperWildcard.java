package lesson11.generic.example9upperWildcard;

import java.util.ArrayList;
import java.util.List;

public class UpperWildcard {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Album> albums = new ArrayList<>();
        List<Brochure> brochures = new ArrayList<>();
        List<Booklet> booklets = new ArrayList<>();

        booklets.add(new Booklet());

        print(books);
        print(albums);
        print(brochures);
        print(booklets);
    }


    private static void print(List<? extends Book> items) {
        for (Book b : items) {
            System.out.println(b.toString());
        }
    }
}

