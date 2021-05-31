package lesson03.array;

import java.util.Arrays;

public class ArraysCopyExample {
    public static void main(String[] args) {
        String[] strings = new String[]{"a", "b", "c", "d"};
        String[] copyOfStrings = Arrays.copyOf(strings, 10);
        System.out.println(Arrays.toString(copyOfStrings));


        System.out.println("Copy of array range");
        int[] numbers = {1, 5, 9, 10, 7, 3};
        int[] copyOfNumbers = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println(Arrays.toString(copyOfNumbers));

    }
}
