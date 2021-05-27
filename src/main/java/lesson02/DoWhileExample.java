package lesson02;

public class DoWhileExample {
    public static void main(String[] args) {
        int count = 11;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 10);
        System.out.println(count);
    }
}
