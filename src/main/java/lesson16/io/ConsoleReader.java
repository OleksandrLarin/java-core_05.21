package lesson16.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static void main(String[] args) {
        String file = "src/main/resources/output.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            String line = reader.readLine();
            while (line != null && !line.equalsIgnoreCase("exit")) {
                writer.write(line);
                writer.newLine();
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
