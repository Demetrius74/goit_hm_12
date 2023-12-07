package org.example;

class FizzBuzzThread implements Runnable {
    private final FizzBuzz fizzBuzz;

    public FizzBuzzThread(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        try {
            fizzBuzz.fizzbuzz();
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
