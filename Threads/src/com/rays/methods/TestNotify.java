package com.rays.methods;

class Noti extends Thread {

    public void run() {

        synchronized (this) {

            try {
                System.out.println("Thread is waiting...");

                wait();

                System.out.println("Thread is running again...");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TestNotify {

    public static void main(String[] args) throws Exception {

        Noti t1 = new Noti();

        t1.start();

        Thread.sleep(1000);

        synchronized (t1) {

            System.out.println("Main calls notify()");

            t1.notify();
        }
    }
}