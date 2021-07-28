package lesson18.concurrency.executor;

public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is started!!");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is done!!");
    }
}
