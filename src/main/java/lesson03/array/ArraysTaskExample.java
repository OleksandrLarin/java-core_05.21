package lesson03.array;

import java.util.Arrays;

public class ArraysTaskExample {
    public static void main(String[] args) {
        int[][] numbers = new int[5][];

        for (int index = 0; index < numbers.length; index++) {
            int length = index + 1;
            numbers[index] = new int[length];
            Arrays.fill(numbers[index], length);
        }
        System.out.println(Arrays.deepToString(numbers));
    }
}
