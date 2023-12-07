package org.example;

class NumberThread implements Runnable {
    private final FizzBuzz fizzBuzz;

    public NumberThread(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        try {
            fizzBuzz.number();
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
