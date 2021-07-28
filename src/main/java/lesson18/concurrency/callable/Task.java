package lesson18.concurrency.callable;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {
    private int a;
    private int b;

    public Task(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() {
        return a + b;
    }
}
