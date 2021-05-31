package lesson03.array;

import java.util.Arrays;

public class ArraysDeepEqualsExample {
    public static void main(String[] args) {
        int[][] deepArray = {{1, 2, 3}, {3, 2, 1}};
        int[][] copyOfDeepArray = {{1, 2, 3}, {3, 2, 1}};

        if (Arrays.deepEquals(deepArray, copyOfDeepArray)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }

        System.out.println(Arrays.deepToString(deepArray));
    }
}
