package lesson12.exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            fis.read();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (Scanner scanner = new Scanner(System.in)){
            if (scanner.hasNext()) {
                System.out.println(scanner.nextLine().toUpperCase());
            }
        }
    }
}
