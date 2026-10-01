package com.rays.methods;

class MyThread3 extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);

            Thread.yield();
        }
    }
}

public class TestYield {

    public static void main(String[] args) {

        MyThread3 t1 = new MyThread3();

        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
        }
    }
}