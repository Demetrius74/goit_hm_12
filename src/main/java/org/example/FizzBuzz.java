package org.example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class FizzBuzz {
    private final int n;
    private int currentNumber = 1;
    private final BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    public FizzBuzz(int n) {
        this.n = n;
    }

    public void fizz() throws InterruptedException {
        while (currentNumber <= n) {
            if (currentNumber % 3 == 0 && currentNumber % 5 != 0) {
                queue.put("fizz");
            }
            currentNumber++;
        }
    }

    public void buzz() throws InterruptedException {
        while (currentNumber <= n) {
            if (currentNumber % 5 == 0 && currentNumber % 3 != 0) {
                queue.put("buzz");
            }
            currentNumber++;
        }
    }

    public void fizzbuzz() throws InterruptedException {
        while (currentNumber <= n) {
            if (currentNumber % 15 == 0) {
                queue.put("fizzbuzz");
            }
            currentNumber++;
        }
    }

    public void number() throws InterruptedException {
        while (currentNumber <= n) {
            if (currentNumber % 3 != 0 && currentNumber % 5 != 0) {
                queue.put(Integer.toString(currentNumber));
            }
            currentNumber++;
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.take());
        }
    }
}
