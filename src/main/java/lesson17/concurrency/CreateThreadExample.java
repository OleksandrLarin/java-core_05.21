package lesson17.concurrency;

import lesson17.concurrency.thread.RunnableImpl;
import lesson17.concurrency.thread.SubClass;

public class CreateThreadExample {
    public static void main(String[] args) {
        Thread subClass = new SubClass();
        Thread implRun = new Thread(new RunnableImpl());
        subClass.start();
        implRun.start();

    }
}
