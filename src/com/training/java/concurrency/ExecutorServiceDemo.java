package com.training.java.concurrency;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<String>> futures = new ArrayList<>();

        Callable<String> callable = new WebSiteCrawlerData();

//        for (int i = 0; i < 5 ; i++) {
//            System.out.println("Submit Request ->"+i);
//            Future<String> future = executorService.submit(callable);
//            futures.add(future);
//        }
//
//        int x =0;
//        for (Future future: futures) {
//            System.out.println("Future value ->"+future.get());
//            System.out.println(" x ->"+x++);
//        }

        executorService.shutdown();

        Date date = new Date();

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.getYear());

    }
}


class WebSiteCrawlerData implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return Thread.currentThread().getName();
    }
}
