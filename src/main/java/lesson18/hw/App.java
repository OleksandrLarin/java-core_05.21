package lesson18.hw;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service  = Executors.newCachedThreadPool();

        Integer integer = service.submit(new AckermanTask(2, 3, service)).get();
        System.out.println(integer);

        service.shutdown();
    }
}
