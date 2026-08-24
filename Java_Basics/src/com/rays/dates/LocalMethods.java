package com.rays.dates;

import java.time.LocalDate;

public class LocalMethods {
	
	public static void main(String[] args) {
		
		LocalDate date=LocalDate.of(2025,8,20); //specifuc date
		
		System.out.println(date);
		
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
	System.out.println(date.getDayOfYear());
	System.out.println(date.getDayOfWeek());
	System.out.println(date.getMonthValue());
		
	}
	
	

}
