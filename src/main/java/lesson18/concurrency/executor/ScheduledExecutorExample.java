package lesson18.concurrency.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorExample {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.scheduleAtFixedRate(new TempIndicator(), 5, 1, TimeUnit.SECONDS);
    }
}
