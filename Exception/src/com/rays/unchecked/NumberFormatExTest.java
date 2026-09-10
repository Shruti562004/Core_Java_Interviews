package com.rays.unchecked;

public class NumberFormatExTest {
	
	public static void main(String[] args) {
		
		String s="abc";//exception
		//s="133"; no exception
		try {
		int a=Integer.parseInt(s);
		System.out.println(a);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
