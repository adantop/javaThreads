package org.example;

public class ThreadRunner implements Runnable {

    private final Runner runner;

    public ThreadRunner(Runner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.runner.getSpeed() * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        this.runner.showResult();
    }
}
