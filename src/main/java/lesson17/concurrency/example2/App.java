package lesson17.concurrency.example2;

public class App {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberWorker(1, 1_000_000_000));
        Thread t2 = new Thread(new NumberWorker(1_000_000_000, 2_000_000_000));

        t1.start();
        t2.start();
    }
}
