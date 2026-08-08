package com.rays.program;

public class StringImmutable {
public static void main(String[] args) {
	
//value not change
	String s="shruti";
	
	String s2="chinu";
	
	System.out.println(s.concat(" ").concat(s2));
	System.out.println(s);
	
	System.out.println("====================================");
	//value change
	StringBuffer s1=new StringBuffer("rathore");
	StringBuffer s3=new StringBuffer("chinu");

	System.out.println(s1.append(" ").append(s3));
	System.out.println(s1);
	
}
}
