package lesson03.array;

import java.util.Arrays;

public class ArraysEqualsExample {
    public static void main(String[] args) {
        //сравнение по ссылке
        int[] numbers1 = {1, 2, 3};
        int[] numbers1_1 = numbers1;
        int[] numbers2 = {1, 2, 3};

        if (numbers1 == numbers2) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Array " + Arrays.toString(numbers1) + " is not equal to array " + Arrays.toString(numbers2));
        }

        if (numbers1 == numbers1_1) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Array " + Arrays.toString(numbers1) + " is not equal to array " + Arrays.toString(numbers2));
        }

        //сравнение по значению
        if (Arrays.equals(numbers1, numbers2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Array " + Arrays.toString(numbers1) + " is not equal to array " + Arrays.toString(numbers2));
        }

    }
}
