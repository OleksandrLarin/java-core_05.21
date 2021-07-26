package lesson17.concurrency.join.example1;

public class App {
    public static void main(String[] args) {
        Thread thread = new Thread(new Run());
        thread.start();

        try {
            System.out.println("Main thread is sleeping.");
            Thread.sleep(100);
            System.out.println("Main thread is waked up.");
            System.out.println("Main thread is waiting for " + thread.getName());
            thread.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is done");
    }
}
