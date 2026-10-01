package com.rays.race;

public class TestRacing {

	public static void main(String[] args) {
		
		Racing t1 = new Racing("Ram");
		Racing t2 = new Racing("Shyam");
		
 		t1.start();
		t2.start();
	}
}


/*Ram

Lock lega aur balance 0 se 1000 karega.

Shyam

Ram ke finish hone tak wait karega.
   
Ram ke baad Shyam lock lega aur balance 1000 se 2000 karega.

Final balance = 2000*/