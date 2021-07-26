package lesson17.concurrency.thread;

public class SubClass extends Thread {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("Thread: " + thread.getName());
    }
}
