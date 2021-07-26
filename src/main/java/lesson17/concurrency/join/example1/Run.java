package lesson17.concurrency.join.example1;

public class Run implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is started");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " is finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
