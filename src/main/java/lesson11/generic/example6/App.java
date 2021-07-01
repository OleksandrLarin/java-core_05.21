package lesson11.generic.example6;

public class App {
    public static void main(String[] args) {
        Storage<Book> bookStorage = new Storage<>();
        bookStorage.add(new Book("Java Core", "Author"));

        bookStorage.printAll();
        Storage<Brochure> brochureStorage = new Storage<>();
        brochureStorage.add(new Brochure("Java Adv", "Author"));

        brochureStorage.printAll();
    }
}
