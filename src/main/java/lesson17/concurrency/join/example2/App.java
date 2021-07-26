package lesson17.concurrency.join.example2;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runner());
        Thread t2 = new Thread(new Runner());
        Thread t3 = new Thread(new Runner());

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}
