package com.rays.thread;



/*
 * Deadlock
 *
 * Thread 1 → lock1 ko pakadta hai → lock2 ka wait karta hai
 * Thread 2 → lock2 ko pakadta hai → lock1 ka wait karta hai
 *
 * Dono threads ek-dusre ke lock ka wait karte rehte hain.
 * Isliye dono aage nahi badh paate aur indefinitely wait karte hain.
 *
 * Is situation ko Deadlock kehte hain.
 */
public class DeadlockDemo {

	static Object lock1 = new Object();
	static Object lock2 = new Object();


	public static void main(String[] args) {

		Thread t1 = new Thread() {

			@Override
			public void run() {

				synchronized (lock1) {

					System.out.println("Thread 1: lock1 mil gaya");

					synchronized (lock2) {

						System.out.println("Thread 1: lock2 mil gaya");
					}
				}
			}
		};


		Thread t2 = new Thread() {

			@Override
			public void run() {

				synchronized (lock2) {

					System.out.println("Thread 2: lock2 mil gaya");

					synchronized (lock1) {

						System.out.println("Thread 2: lock1 mil gaya");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}