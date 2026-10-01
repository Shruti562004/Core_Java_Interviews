package com.rays.methods;

class TestWait {
    public static void main(String[] args) throws Exception {

        Object obj = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (obj) {
                try {
                    System.out.println("Thread waiting...");
                    obj.wait();
                    System.out.println("Thread resumed");
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (obj) {
                System.out.println("Thread notifying...");
                obj.notify();
            }
        });

        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}