package lesson18.concurrency.example1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws InterruptedException {
        PrimeNumber t1 = new PrimeNumber(3, 50_000);
        PrimeNumber t2 = new PrimeNumber(50_001, 100_000);

        long start = System.currentTimeMillis();
        t2.start();
        t1.start();

        t2.join();
        t1.join();
        long end = System.currentTimeMillis();
        List<Integer> allPrimeNumbers = new ArrayList<>();
        allPrimeNumbers.addAll(t1.getNumbers());
        allPrimeNumbers.addAll(t2.getNumbers());
        System.out.println(allPrimeNumbers);
        System.out.println(end - start);
    }

}
