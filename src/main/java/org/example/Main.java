package org.example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        Runnable thread1 = new Task1();

        Runnable thread2 = () -> System.out.println("Минуло 5 секунд");

        executor.scheduleAtFixedRate(thread1, 0, 1, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(thread2, 5, 5, TimeUnit.SECONDS);
    }
}