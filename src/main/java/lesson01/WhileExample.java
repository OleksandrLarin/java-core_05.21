package lesson01;

public class WhileExample {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            System.out.println("Count is: " + count);
            count++;
        }

        count = 0;
        while (true) {
            System.out.println("Count is:" + count);
            count++;
            if (count == 10) {
                break;
            }
        }

        while (count < 10) {
            System.out.println(count);
            break;
        }

    }
}
