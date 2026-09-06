package com.rays.exception;

public class TryWithMultiCatch {
	public static void main(String[] args) {
		
		int a=8;
		int b=0;
		int c;
		String s=null;
		
		try {
			c=a/b;
			System.out.println(c);
		
		}
		
		
		
		catch(ArithmeticException e2) {
			System.out.println(e2.getMessage());
		}
		
		
		catch(NullPointerException e1) {
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		catch(Exception e3) {
			System.out.println(e3.getMessage());
		}
		
		
		
		
		
	}

}
