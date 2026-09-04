package com.rays.dates;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarModify {

	public static void main(String[] args) throws ParseException {

		Calendar c = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Date d = sdf.parse("01-01-2026");
		
		c.setTime(d);       
		
		for (int i = 1; i <= 12; i++) {
			System.out.println(sdf.format(c.getTime()));
			c.add(Calendar.DATE, 30);
				//	c.add(Calendar.DATE, 3);

		}   


	}
}