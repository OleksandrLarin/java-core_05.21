package lesson17.concurrency.join.example2;

public class Runner implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName() + " is done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
