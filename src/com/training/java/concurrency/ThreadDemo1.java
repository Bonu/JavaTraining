package com.training.java.concurrency;

class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.println("----Task2----");
        for (int i = 0; i < 20; i++) {
            System.out.println("i :"+i);
            if(i > 10) {
                    Thread.yield();
            }
        }
    }
}

class Task1 implements Runnable {

    @Override
    public void run() {

        System.out.println("----Task1----");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----End Task1----");
    }
}

public class ThreadDemo1 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        Thread thread1 = new Thread(task1);
        thread1.start();
        Thread thread2 = new Thread(task2);
        thread2.start();


    }
}
