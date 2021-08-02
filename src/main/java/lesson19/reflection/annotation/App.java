package lesson19.reflection.annotation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        loadProperties();
        MyClass myClass = new MyClass("My Name");
        MyClass secondClass = new MyClass();
        initialize(myClass);
        initialize(secondClass);

        System.out.println(myClass);
        System.out.println(secondClass);
    }

    private static void initialize(Object myClass) {
        Handler handler = new ValueHandler();
        handler.handle(myClass);
    }

    private static void loadProperties() {
        try {
            Properties properties = new Properties();
            properties.load(new FileReader("src/main/resources/app.properties"));
            System.setProperties(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
