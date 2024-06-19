package org.learn.Multithreading.callabletest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers(2, 3);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> event =  executorService.submit(addTwoNumbers);
        System.out.println(event.get());

    }
}
