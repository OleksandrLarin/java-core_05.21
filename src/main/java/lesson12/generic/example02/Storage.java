package lesson12.generic.example02;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private List<T> list = new ArrayList<>();

    public void addAll(List<? extends T> items) {
        list.addAll(items);
    }

    public static void main(String[] args) {
        Storage<Book> bookStorage = new Storage<>();
        List<Album> albums = new ArrayList<>();
        albums.add(new Album());

        bookStorage.addAll(albums);
    }
}
