package com.training.java.concurrency;

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("---Thread Run--");
//        while (true) {
//            // do something
//        }

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        System.out.println("---last line --------");
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
        Task task = new Task();

        Thread thread1 = new Thread(task);
        thread1.start();
        Thread thread2 = new Thread(task);
        thread2.start();
        Thread thread3 = new Thread(task);
        thread3.start();


    }
}
