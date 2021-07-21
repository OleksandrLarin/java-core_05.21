package lesson16.io.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        String fileName = "src/main/resources/test.txt";

        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            int i = inputStream.read();
            while (i != -1) {
                System.out.print(((char) i) + "_");
                i = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
