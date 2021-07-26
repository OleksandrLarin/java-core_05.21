package lesson17.concurrency.example1;

import java.util.Scanner;

public class Worker implements Runnable {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        int i = scanner.nextInt();
        while (i != 0) {
            System.out.println("Hello from thread " + Thread.currentThread().getName());
            System.out.println("number is " + i);
            i = scanner.nextInt();
        }
        System.out.println("Finish!");
    }
}
