package lesson04.strings;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String name = "Vasiliy_Petrov";

        String[] fullName = name.split("_");

        System.out.println(Arrays.toString(fullName));
        System.out.println("Name: " + fullName[0]);
        System.out.println("Last Name: " + fullName[1]);
    }
}
