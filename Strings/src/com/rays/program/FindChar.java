package com.rays.program;

public class FindChar {
public static void main(String[] args) {
	
	String s1="Shruti";
	char target='o';

    int position = s1.indexOf(target);
	if(s1.indexOf(target)!=-1) {
		System.out.println("char found " +target);
		System.out.println("position " +position);
	}
	
	else {
		System.out.println("char not found " + target);
		
		System.out.println("position " +position);
	}
}
}
