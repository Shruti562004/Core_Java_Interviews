package com.rays.methods;

public class StringMethods {
public static void main (String[] args) {
		
		String name = "Shruti ";
		String str = "Rathore";

		
		System.out.println(name.length());
		System.out.println(name.trim().length());
		
	String e = name + str;
	System.out.println(e);
		
		System.out.println("String Length = "+ name.length());
		System.out.println("UpperCase = "+ name.toUpperCase());
		System.out.println("LowerCase = "+ name.toLowerCase());
		System.out.println("StartWith = "+ name.startsWith("R"));
		System.out.println("EndWith = "+ name.endsWith("t"));
		System.out.println("CharAt = "+ name.charAt(0));
		System.out.println("IndexOf = "+ name.indexOf("h"));
		System.out.println("LastIndexOf = "+ name.lastIndexOf("a"));
		System.out.println("SubString = "+ name.substring(1));
		System.out.println("Trim = "+ name.trim());
		System.out.println("Concat = "+ name.concat(str));
		System.out.println("Concat = "+ str.concat(name));
		System.out.println("Replace = "+ name.replace("shruti", "chinu"));
		
		 String str1 = "hellow java";
	        String[] s = str1.split(" "); //split space ke hisab se string ko tod deta h 
	        for (String s1 : s) {
	            System.out.print( s1);
	        }
	        
	        System.out.println("........................");
	        
	        String s3 = "SUNRAYS";
			String s4 = "SUNRAYS";
			
			String s5 = new String("SUNRAYS");
			String s6 = new String("SUNRAYS");

			
			boolean b = s3 == s4;
			System.out.println(b);
			
			boolean p = s3.equals(s4);
			System.out.println(p);
			
			boolean p1 = s5.equals(s6);
			System.out.println(p1);
			
			boolean b1 = s5 == (s6);
			System.out.println(b1);
			
				
			StringBuffer sb1 = new StringBuffer("ram");
			StringBuffer sb2 = new StringBuffer("ram");
			
			boolean bb = sb1.equals(sb2);
			System.out.println(bb);
	}
}