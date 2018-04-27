package com.training.java.concurrency;


class Task3 implements Runnable {

    @Override
    public void run() {

        Thread thread = Thread.currentThread();
        System.out.println("Current Thread ->"+thread.getName());
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task Thread alive ? ->"+thread.isAlive());
    }
}

public class ThreadDemo2 {

    public static void main(String[] args) {

        System.out.println("  Main method start ");
        Thread thread = new Thread(new Task3());
        thread.start();

        try {
            thread.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" Join the thread after 1 second");
        System.out.println("In main Thread ->"+thread.getName());
        System.out.println("Main Thread alive ? ->"+thread.isAlive());
    }
}
