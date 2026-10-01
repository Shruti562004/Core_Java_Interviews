package com.rays.thread;

class MyThread extends Thread {

    public void run() {

        while (true) {
            System.out.println("Daemon thread running...");

                try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
         
        }
    }
}

public class TestDaemon {

    public static void main(String[] args) throws Exception {

        MyThread t1 = new MyThread();

 t1.setDaemon(true);   // make daemon thread

        t1.start();

        Thread.sleep(3000); // background mr t1 chltsa rhega , main thread 3 sec k liye hold

        System.out.println("Main thread finished");
        
        /*Main thread finish hone ke baad koi aur 
        user thread nahi hai, isliye JVM daemon thread ko bhi terminate kar sakti hai,
         chahe uska while(true) loop chal raha ho.*/
    }
}
