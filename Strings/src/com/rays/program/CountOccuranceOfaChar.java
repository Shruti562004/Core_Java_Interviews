package com.rays.program;

public class CountOccuranceOfaChar {
public static void main(String[] args) {
	
	String s="chiinuu";
	
	int count=0;
	
	char ch='i';
	
	for( int i=0;i<s.length();i++) {
		if(s.charAt(i)==ch) {
		count++;	
			
		}
	}
	
	System.out.println(ch+ " = "  +count);
}
}
