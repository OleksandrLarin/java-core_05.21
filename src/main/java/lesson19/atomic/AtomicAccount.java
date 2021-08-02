package lesson19.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicAccount {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger a = new AtomicInteger(1);
        ExecutorService executor = Executors.newFixedThreadPool(4);


        for (int i = 100_000; i > 0; i--) {
            executor.submit(new Task(a));
        }


        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(a.get()); //100_001
    }


    private static class Task implements Runnable {


        static AtomicInteger integer;


        public Task(AtomicInteger a) {
            integer = a;
        }


        @Override
        public void run() {
            integer.incrementAndGet();
        }
    }
}

