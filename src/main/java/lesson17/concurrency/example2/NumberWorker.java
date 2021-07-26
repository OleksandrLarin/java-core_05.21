package lesson17.concurrency.example2;

public class NumberWorker implements Runnable{
    private int from;
    private int to;

    public NumberWorker(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = from; i <= to; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
