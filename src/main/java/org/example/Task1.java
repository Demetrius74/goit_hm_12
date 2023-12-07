package org.example;

public class Task1 implements Runnable{
    private final long startTime = System.currentTimeMillis();

    @Override
    public void run() {
        long currentTime = System.currentTimeMillis();
        long secondsElapsed = (currentTime - this.startTime) / 1000;
        System.out.println("Минуло " + secondsElapsed + " секунд");
    }
}
