package com.training.java.concurrency;


import jdk.nashorn.internal.codegen.CompilerConstants;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ApiCallTask implements Runnable {

    CountDownLatch countDownLatch;
    private CountDownLatch startSignal = null;
    private CountDownLatch doneSignal = null;

    ApiCallTask(CountDownLatch startSignal, CountDownLatch doneSignal) {
        this.startSignal = startSignal;
        this.doneSignal = doneSignal;
    }
    public ApiCallTask(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println("---do something--waiting--");
            startSignal.await();
            doWork();
            doneSignal.countDown();
            System.out.println("---do something--2--");
        } catch (InterruptedException ex) {} // return;
    }
    void doWork() {
        System.out.println("---do something--inside--");
    }
}

public class LatchDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSignal = new CountDownLatch(5);

        for (int i = 0; i < 5; ++i) // create and start threads
            new Thread(new ApiCallTask(startSignal, doneSignal)).start();

        System.out.println("-----doSomethingElse()--- don't let run yet-----1-");  // don't let run yet
        startSignal.countDown();      // let all threads proceed
        System.out.println("-----doSomethingElse()--- don't let run yet-----2-");
        doneSignal.await();           // wait for all to finish
        System.out.println("-----Waited all threads done-------");
    }

}




