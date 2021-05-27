package lesson02;

public class Task {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 87, 16, 96};
        int[] result = new int[numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                result[count] = numbers[i];
                count++;
            }
        }
        for (int value : result) {
            if (value == 0) {
                continue;
            }
            System.out.println(value);
        }
    }
}
