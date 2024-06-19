package com.company;

public class Main {

    public static void main(String[] args) {
        // 1
        // 2
        // 3
        //eventListener
        // move alien_ships
        // move fire
        // move fire out ship

        System.out.println("thread name is: " + Thread.currentThread().getName());

//        for (int j = 0; j < 10; j++) {
//            Thread t1 = new Thread(() -> {
//                for (int i = 1; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName() + " : " + i);
//                }
//            });
//            t1.start();
//        }

        for (int j = 0; j < 10; j++) {
            //Thread t = new Thread(() -> { ... } , "thread - " + j);
            //Thread t2 = new Thread(Task::run2 , "thread - " + j);
            Thread t = new Thread(new Task(), "thread - " + j);
            ThreadClass tc = new ThreadClass("thread - " + j);

            // t.run(); // Thread.main is running this line
            t.start(); // creates and starts the thread
            tc.start();
        }

        System.out.println("Thread main exited.");
    }
}
