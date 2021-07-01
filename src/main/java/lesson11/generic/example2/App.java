package lesson11.generic.example2;

import lesson11.generic.example1.User;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List objects = new ArrayList();


        strings.add("string");
        objects.add("string");

        objects.add(new User("John", "e@d.c"));

    }
}
