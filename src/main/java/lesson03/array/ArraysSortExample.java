package lesson03.array;

import java.util.Arrays;

public class ArraysSortExample {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 2, 9, 7};
        Arrays.sort(numbers);

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
