package com.rays.methods;

class MyThread7 extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TestSleep {

    public static void main(String[] args) {

        MyThread7 t1 = new MyThread7();
        t1.start();
    }
}