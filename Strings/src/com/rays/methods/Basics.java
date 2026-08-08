package com.rays.methods;

public class Basics {
	public static void main(String[] args) {
		//concat
		String s1="Shruti";
		String s2="Rathore";
		System.out.println(s1.concat(" ").concat(s2));
		
		
		System.out.println("=====================================");
		
		//substring
		String s3="Shruti Rathore";
		System.out.println(s3.substring(7));
		
		
		
		System.out.println("=====================================");
		
		//character count
		
		System.out.println(s3.length());
		
		System.out.println("=====================================");
		
	String s4=" hhhgh  tt ";
	
	System.out.println(s4);
	System.out.println(s4.trim());
	System.out.println("=====================================");
	
	String y1="hello";
	String y2="HELLO";
	System.out.println(y1.equalsIgnoreCase(y2));
	
	
	}
	
	

}
