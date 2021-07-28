package lesson18.concurrency.executor;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        List<Runnable> tasks = getTasks();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (Runnable task : tasks) {
            executorService.submit(task);
        }
        executorService.shutdown();
    }

    private static List<Runnable> getTasks() {
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();

        return List.of(task1, task2, task3);
    }
}
