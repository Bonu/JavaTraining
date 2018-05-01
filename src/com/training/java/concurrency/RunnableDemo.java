package com.training.java.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunnableDemo {

    public static void main(String[] args) {
        Runnable task1 = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable task2 = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Executor executor = Executors.newCachedThreadPool();
        executor.execute(task1);
        executor.execute(task2);
    }
}
