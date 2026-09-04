package com.rays.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTest {
	
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Person p=new Person();
		
		p.setName("Shruti");
		p.setAddress("Indore");
		Date d=sdf.parse("2004-06-05");
		p.setDateOfBirth(d);
		
		System.out.println("Name= "+p.getName());
		System.out.println("Address=" +p.getAddress());
		 System.out.println("DOB = " + sdf.format(p.getDateOfBirth()));
	}

}
