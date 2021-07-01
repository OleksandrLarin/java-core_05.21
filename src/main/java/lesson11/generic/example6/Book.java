package lesson11.generic.example6;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void printInfo() {
        System.out.println("Book: "  + name);
        System.out.println("Author: "  + author);
    }
}
