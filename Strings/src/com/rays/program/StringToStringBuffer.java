package com.rays.program;

public class StringToStringBuffer {
	public static void main(String[] args) {
		
		
		String s1="shruti";
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb);
		System.out.println(sb.insert(6, "Rathore"));
		
	}

}
