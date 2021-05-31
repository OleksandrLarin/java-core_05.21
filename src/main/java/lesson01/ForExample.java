package lesson01;

public class ForExample {
    public static void main(String[] args) {
        for (int count = 0; count < 10; count++) {
            if (count == 3) {
                continue;
            }
            System.out.println("Count is: " + count);
            if (count == 7) {
                break;
            }
        }

        System.out.println("==============");

        for (int count = 2; count <= 10; count += 3) {
            System.out.println("Count is: " + count);
        }

        System.out.println("==============");

        for (int count = 0; count <= 10; ) {
            System.out.println("Count is: " + count);
            count += 2;
        }

    }
}
