package lesson18.hw;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class AckermanTask implements Callable<Integer> {

    private final int m;
    private final int n;
    private final ExecutorService service;

    public AckermanTask(int m, int n, ExecutorService service) {
        this.m = m;
        this.n = n;
        this.service = service;
    }

    @Override
    public Integer call() throws Exception {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return service.submit(new AckermanTask(m - 1, 1, service)).get();
        }
        int n = service.submit(new AckermanTask(m, this.n - 1, service)).get();
        return service.submit(new AckermanTask(m - 1, n, service)).get();
    }
}
