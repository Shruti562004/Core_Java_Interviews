package com.rays.program;

public class CountSumOfIntegerFromString {
public static void main(String[] args) {
	

	
	String s1="Shruti453Rathore";
	
	int sum=0;
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		if(Character.isDigit(ch)) {
			sum+=Character.getNumericValue(ch);
			
			//System.out.print(ch);
	
		}
	}
//	System.out.println();
	
	System.out.println(" sum =" +sum);
}
}