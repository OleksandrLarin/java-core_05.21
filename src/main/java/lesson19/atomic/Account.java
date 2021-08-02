package lesson19.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Account {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(1);
        ExecutorService executor = Executors.newFixedThreadPool(4);


        for (int i = 100_000; i > 0; i--) {
            executor.submit(new Task(counter));
        }


        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(counter.getCount()); //100_001
    }


    private static class Task implements Runnable {


        static Counter integer;


        public Task(Counter a) {
            integer = a;
        }


        @Override
        public void run() {
            integer.increment();
        }
    }
}

