package lesson03.array;

import java.util.Arrays;

public class ArraysFillExample {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Arrays.fill(numbers, 30);

        System.out.println(Arrays.toString(numbers));

        Arrays.fill(numbers, 4, 8, -30);

        System.out.println(Arrays.toString(numbers));


        long[] millis = new long[1000];
        for (int i = 0; i < millis.length; i++) {
            millis[i] = System.currentTimeMillis();
        }
        System.out.println(Arrays.toString(millis));
    }
}
