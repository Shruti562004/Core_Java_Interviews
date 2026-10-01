package com.rays.methods;

class MyThread extends Thread {

    public void run() {
        System.out.println("Running...");
    }
}

public class SetNameTest {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
System.out.println(t1.getName());
        t1.setName("ShrutiThread");

        System.out.println(t1.getName());

        t1.start();
    }
}