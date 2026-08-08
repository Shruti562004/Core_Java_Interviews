package com.rays.program;

public class CountOccuranceOfString {
public static void main(String[] args) {
	
	String s="hello java";
	String print="";
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(print.indexOf(c)==-1 && c!=' ') {
			int count=0;
			
		    for (int j = 0; j < s.length(); j++) {
		    	
		    	if(c==s.charAt(j)) {
		    		
		    		count++;
		    	}
		    }
		    
		    System.out.println(c+" = " +count);
		    print+=c;
		    }
		}
		
	}
}
