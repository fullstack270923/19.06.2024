package com.company;

public class Task implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void run2() {
        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

}
