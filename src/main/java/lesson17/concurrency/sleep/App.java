package lesson17.concurrency.sleep;

public class App {
    public static void main(String[] args) {
        Thread sleepWorker = new SleepWorker();
        sleepWorker.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is done!");
    }
}
