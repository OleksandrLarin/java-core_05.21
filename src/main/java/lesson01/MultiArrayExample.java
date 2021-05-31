package lesson01;

public class MultiArrayExample {

    public static void main(String[] args) {
        double[][] multiArray = new double[3][3];

        multiArray[0][0] = 0;
        multiArray[0][1] = 1;
        multiArray[0][2] = 2;

        multiArray[1][0] = 10;
        multiArray[1][1] = 20;
        multiArray[1][2] = 30;

        multiArray[2][0] = 100;
        multiArray[2][1] = 200;
        multiArray[2][2] = 300;

        System.out.println(multiArray[2][1]);

        String[][] stringArray = {
                {"A", "B", "C"},
                {"a", "b", "c"}
        };
        System.out.println(stringArray[1][1]);

        int[] intArray = new int[10];
        int number = 2;
        for (int index = 0; index < intArray.length; index++) {
            intArray[index] = number;
            if (intArray[index] % 2 != 0){

            }
            number += 2;
        }
        System.out.println(intArray[9]);

    }
}
