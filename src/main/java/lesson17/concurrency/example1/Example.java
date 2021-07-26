package lesson17.concurrency.example1;

public class Example {
    public static void main(String[] args) {
        Thread worker = new Thread(new Worker());
        Thread worker2 = new Thread(new Worker());
        worker.start();
        worker2.start();

        for (long i = 0; i < 5_555_555_555L; i++) {
            if (i % 1_000_000_000 == 0) {
                System.out.println("Hello from thread " + Thread.currentThread().getName());
            }
        }
    }

}
