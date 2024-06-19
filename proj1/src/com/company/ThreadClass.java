package com.company;

public class ThreadClass extends Thread {

    private int x;

    public ThreadClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        x++;
        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
