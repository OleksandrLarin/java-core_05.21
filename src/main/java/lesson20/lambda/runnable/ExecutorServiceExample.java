package lesson20.lambda.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 3; i != 0; i--) {
            executorService.submit(ExecutorServiceExample::run);
        }
        executorService.shutdown();
    }

    private static void run() {
        System.out.println(Thread.currentThread().getName() + " is started!!");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is done!!");
    }
}
