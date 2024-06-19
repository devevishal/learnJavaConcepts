package org.learn.Multithreading.callabletest;

import java.util.concurrent.Callable;

public class AddTwoNumbers implements Callable<Integer> {

    private  int a;
    private  int b;
    public AddTwoNumbers(int a, int b) {
        this.a = a ;
        this.b = b;
    }


    @Override
    public Integer call() throws Exception {
       return a + b;
    }
}
