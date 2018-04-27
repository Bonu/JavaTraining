package com.training.java.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATMLocksDemo1 {

    private Lock lock;
    private double accountBalanace = 1000;

    public double getAccountBalanace() {
        return accountBalanace;
    }

    public ATMLocksDemo1() {
        this.lock = new ReentrantLock();
    }

    public void deposit(double amount){
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

        ATMLocksDemo1 atmThreadsDemo = new ATMLocksDemo1();
        System.out.println("--Amount --- before transaction ->"+atmThreadsDemo.getAccountBalanace());
        atmThreadsDemo.deposit(100);
        atmThreadsDemo.deposit(100);
        atmThreadsDemo.deposit(100);
        atmThreadsDemo.withdraw(200);
        atmThreadsDemo.withdraw(200);
        atmThreadsDemo.withdraw(200);
        atmThreadsDemo.withdraw(200);

        System.out.println("--Amount --- after transaction ->"+atmThreadsDemo.getAccountBalanace());
    }
}
