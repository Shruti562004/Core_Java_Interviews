package com.rays.program;



public class LowerUppercase {

	public static void main(String[] args) {

		String str = "Sandeep";

		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if (i % 2 == 0) {
			
				
				//String s = String.valueOf(str.charAt(i));
				System.out.print(Character.toLowerCase(ch));
			}else {
				//String s1 = String.valueOf(str.charAt(i));
				System.out.print(Character.toUpperCase(ch));
				
				
			}

		}
	}

}