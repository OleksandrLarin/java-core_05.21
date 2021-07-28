package lesson18.concurrency.executor;

import java.util.Random;

public class TempIndicator implements Runnable {
    @Override
    public void run() {
        int temp = new Random().nextInt(50);
        System.out.println("Current temp is " + temp + " C");
    }
}
