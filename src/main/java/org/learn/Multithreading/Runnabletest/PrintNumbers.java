package org.learn.Multithreading.Runnabletest;

public class PrintNumbers implements Runnable{

    int number ;
    public PrintNumbers(int number){
        this.number = number;
    }



    @Override
    public void run() {
        System.out.println("Printed "+ number+" from thread "+ Thread.currentThread().getName());
    }
}
