package com.rays.program;

public class Constants {
	
	public static void main(String[] args) {
		String s ="Shruti Rathore";
		int count=0;
		String print="";
		for(int i=0;i<s.length();i++) {
		
			char ch = Character.toLowerCase(s.charAt(i));
			if (ch != ' ' &&  ch != 'a' && ch != 'e' && ch != 'i' &&
				    ch != 'o' && ch != 'u' &&
				    print.indexOf(ch) == -1) {

				count++;
				print+=ch;
			}
			
		}
		if(count>0) {
			System.out.println(count);
		}
		
		System.out.println(print);
	}

}
