package lesson18.concurrency.example1;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber extends Thread {
    private final int from;
    private final int to;
    private final List<Integer> numbers;


    public PrimeNumber(int from, int to) {
        this.from = from;
        this.to = to;
        numbers = new ArrayList<>();
    }


    @Override
    public void run() {
        for (int i = from; i <= to; i++) {
            if (isPrime(i)) {
                numbers.add(i);
            }
        }
    }


    private boolean isPrime(int number) {
        if (number < 3) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(number); i = i + 1) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}

