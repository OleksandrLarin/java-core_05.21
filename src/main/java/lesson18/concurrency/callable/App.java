package lesson18.concurrency.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Future<Integer> submit = service.submit(new Task(new Random().nextInt(20), 30));
            futures.add(submit);
        }
        for (Future<Integer> future : futures) {
            System.out.println(future.get());
        }
        service.shutdown();
    }
}
