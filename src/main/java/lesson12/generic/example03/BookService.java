package lesson12.generic.example03;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public static void main(String[] args) {
        List<Album> albumSource = new ArrayList<>();
        List<Album> albumDestination = new ArrayList<>();
        List<Book> booksDestination = new ArrayList<>();
        List<Object> objectsDestination = new ArrayList<>();
        copyToBooks(albumSource, booksDestination);
        copyToBooks(albumSource, albumDestination);
        copyToBooks(albumSource, objectsDestination);
    }

    public static void copyToBooks(List<? extends Album> src, List<? super Album> dest) {
        for (Album book : src) {
            dest.add(book);
        }
    }
}
