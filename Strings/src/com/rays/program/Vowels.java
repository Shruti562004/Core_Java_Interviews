package com.rays.program;

public class Vowels {
	
	public static void main(String[] args) {
		String s="aieouser";
		
		String print="";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
		
		if((ch=='a'||ch=='i'||ch=='o'||ch=='u'|| ch=='e')&& print.indexOf(ch)==-1){
			count++;
	
		print+=ch;
		}
	}
		
		if(count>0) {
		
			System.out.println(print +" count =" +count);
		}
	}
	}
