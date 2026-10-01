package com.rays.methods;

class MyThread2 extends Thread {

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TestState {

    public static void main(String[] args) throws Exception {

        MyThread2 t1 = new MyThread2();

        System.out.println(t1.getState());  // NEW

        t1.start();

        System.out.println(t1.getState());  // RUNNABLE or TIMED_WAITING

        Thread.sleep(500);

        System.out.println(t1.getState());  // TIMED_WAITING

        t1.join();

        System.out.println(t1.getState());  // TERMINATED
    }
}