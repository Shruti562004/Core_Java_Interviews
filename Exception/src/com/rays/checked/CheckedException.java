package com.rays.checked;


public class CheckedException {
	public static void main(String[] args){
	try {
		dad();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	public static void dad() throws Exception  {
		mom();

	}

	public static void mom() throws Exception {
		
		System.out.println("hjh");
		son();
		

	}

	public static void son() throws Exception {
System.out.println("kkj");
	
	Class.forName("com.rays.checked.FileNotFoundExceptionTests");

	}

}