package com.rays.methods;


public class Capacity {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Shruti");
		
		System.out.println("length:" + sb.length());
		System.out.println("capacity:" + sb.capacity());
		
		System.out.println(sb.append("rathore"));
		System.out.println("length:" + sb.length());
		System.out.println("capacity:" + sb.capacity());
		
		System.out.println(sb.append("patel"));
		System.out.println("length:" + sb.length());
		System.out.println("capacity:" + sb.capacity());

	}
}