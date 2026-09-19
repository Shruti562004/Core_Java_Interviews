package com.rays.checked;

public class InterruptedExceptionTest {
public static void main(String[] args) {
	  try {
	   System.out.println("Before sleep");
	   
	 
	Thread.sleep(2000);
	   System.out.println("After sleep");

       throw new InterruptedException(); // manually call then excp came
	  }
	  catch(InterruptedException e){
		  e.printStackTrace();
		  System.out.println("Thread interrupted");
	  }
}
}
