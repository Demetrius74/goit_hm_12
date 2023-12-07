package org.example;

class BuzzThread implements Runnable {
    private final FizzBuzz fizzBuzz;

    public BuzzThread(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        try {
            fizzBuzz.buzz();
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
