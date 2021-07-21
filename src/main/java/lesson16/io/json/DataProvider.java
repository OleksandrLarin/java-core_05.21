package lesson16.io.json;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataProvider {
    public Map<String, Object> getData() {
        Map<String, Object> data = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            while (!"end".equalsIgnoreCase(str)) {
                String[] pair = str.split("=");
                data.put(getKey(pair), getValue(pair));
                str = scanner.nextLine();
            }
        }
        return data;
    }

    private String getKey(String[] pair) {
        return pair[0].trim();
    }

    private Object getValue(String[] pair) {
        String value = pair[1].trim();
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return value;
        }
    }
}
