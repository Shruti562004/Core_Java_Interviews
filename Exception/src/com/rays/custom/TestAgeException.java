package com.rays.custom;

public class TestAgeException {
public static void main(String[] args) {
	
	int age=15;
	try {
	if(age>=18) {
		System.out.println("Valid age");
	}

	else {
		throw new AgeException("Invalid age");
	}
	}
	catch (AgeException e) {
		System.out.println("juj");
	e.printStackTrace();
	}

	
	System.out.println("Uncheceked");
}
}
