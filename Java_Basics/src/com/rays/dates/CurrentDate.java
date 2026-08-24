package com.rays.dates;

import java.util.Date;

public class CurrentDate {
	
	
	public static void main(String[] args) {
		
		Date d=new Date(); //system time 
		
		long time= d.getTime();
		
		System.out.println("date "+d);
		System.out.println(time);
		
	}

}
