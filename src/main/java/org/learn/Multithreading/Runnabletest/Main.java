package org.learn.Multithreading.Runnabletest;

import java.util.concurrent.*;

public class Main {


    public static void main(String[] args) {
        int n = 5;
//        Thread thread1 = new Thread(new PrintNumbers(n));
//        n = 6;
//        Thread thread2 = new Thread(new PrintNumbers(n));
//        thread1.start();
//        thread2.start();
        // executors

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new PrintNumbers(1));
        executorService.execute(new PrintNumbers(2));

        executorService.execute(new PrintNumbers(3));
        executorService.execute(new PrintNumbers(4));
        executorService.execute(new PrintNumbers(5));
        executorService.execute(new PrintNumbers(6));
        executorService.execute(new PrintNumbers(7));

        executorService.execute(new PrintNumbers(8));
        executorService.execute(new PrintNumbers(9));
        executorService.execute(new PrintNumbers(10));

        executorService.shutdown();








    }
}
