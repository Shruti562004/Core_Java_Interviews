package com.rays.methods;
class MyThread4 extends Thread {

    public void run() {
        System.out.println("Thread is running");

      
    }
}

public class TestAlive {

    public static void main(String[] args) throws Exception {

        MyThread4 t1 = new MyThread4();

        System.out.println(t1.isAlive());  // false

        t1.start();

        System.out.println(t1.isAlive());  // true

        t1.join();

        System.out.println(t1.isAlive());  // false t1 finish hogya
    }
}