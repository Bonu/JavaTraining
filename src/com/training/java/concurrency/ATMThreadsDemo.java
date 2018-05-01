package com.training.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Withdraw implements Runnable {

    Lock lock;

    public Withdraw(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
//        Collections.unmodifiableList();
        ATMThreadsDemo atmThreadsDemo = new ATMThreadsDemo();
        atmThreadsDemo.withdraw(100);
    }
}

class Deposit implements Runnable {

    Lock lock;

    public Deposit(Lock lock ) {
        this.lock = lock;
    }

    @Override
    public void run() {
        ATMThreadsDemo atmThreadsDemo = new ATMThreadsDemo();
        atmThreadsDemo.deposit( 500);
    }
}

public class ATMThreadsDemo  extends Object{

    private double accountBalanace = 1000;

    public double getAccountBalanace() {
        return accountBalanace;
    }

    public ATMThreadsDemo() {

    }

    public void deposit(double amount){

        Lock lock = new ReentrantLock();
        lock.lock();
        System.out.println("----deposit----");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        accountBalanace = accountBalanace + amount;
        System.out.println("----deposit--done--");
        lock.unlock();
    }

    public void withdraw(double amount){
        Lock lock = new ReentrantLock();
        lock.lock();
        System.out.println("----withdraw----");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountBalanace = accountBalanace - amount;
        System.out.println("----withdraw--complete--");
        lock.unlock();
    }

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Runnable d1 = new Deposit(lock);
        Runnable w1 = new Withdraw(lock);
        Runnable d2 = new Deposit(lock);
        Runnable w2 = new Withdraw(lock);

        pool.execute(d1);
        pool.execute(w1);
        pool.execute(d2);
        pool.execute(w2);

        pool.shutdown();

    }
}
