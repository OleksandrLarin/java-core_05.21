package lesson16.io.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String fileName = "src/main/resources/test.txt";

        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            String helloWorld = "Hello World!";
            outputStream.write(helloWorld.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
