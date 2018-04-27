package com.training.java.concurrency;

public class ThreadInterrupt {

    public static void main(String[] args) {

    }
}


class Task5 implements Runnable {

    @Override
    public void run() {
        // Cause of the exception is the code written here

    }
}


// Dead lock occurs when more threads access same resource that is unavailable.
// Synchronization says only one thread can execute particular block of code.
