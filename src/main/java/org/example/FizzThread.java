package org.example;

class FizzThread implements Runnable {
    private final FizzBuzz fizzBuzz;

    public FizzThread(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        try {
            fizzBuzz.fizz();
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}