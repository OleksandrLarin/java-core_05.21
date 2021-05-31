package lesson03;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        double[] numbers = createArray(10);
        double[] doubleNumbers = createArray(4);

        fillWithRandomNumbers(numbers);
        fillWithRandomNumbers(doubleNumbers);

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(doubleNumbers));
    }

    public static void fillWithRandomNumbers(double[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = Math.random();
        }
    }

    public static double[] createArray(int length) {
        return new double[length];
    }

    public static int[] createIntArray(int length) {
        return new int[length];
    }

}
