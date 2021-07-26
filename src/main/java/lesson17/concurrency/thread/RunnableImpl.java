package lesson17.concurrency.thread;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable: " + Thread.currentThread().getName());
    }
}
