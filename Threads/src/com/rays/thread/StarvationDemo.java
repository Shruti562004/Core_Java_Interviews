package com.rays.thread;


public class StarvationDemo {

	static Object lock = new Object();

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			synchronized (lock) {
				System.out.println("T1 ko lock mila");
			}
		});

		Thread t2 = new Thread(() -> {
			while (true) {
				synchronized (lock) {
					System.out.println("T2 lock le raha hai");
				}
			}
		});

		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);

		t2.start();
		t1.start();
	}
}