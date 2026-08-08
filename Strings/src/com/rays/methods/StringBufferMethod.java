package com.rays.methods;

public class StringBufferMethod {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("java");

		System.out.println("length :" + sb.length());

		System.out.println("delete :" + sb.delete(0, 2));

		System.out.println("string :" + sb.toString());

		System.out.println("insert : " + sb.insert(2, "w"));

		System.out.println("Capacity : " + sb.capacity());

		System.out.println("IndexOf:" + sb.indexOf("v"));

		System.out.println("CharAt:" + sb.charAt(1));

		System.out.println("Replace:" + sb.replace(0, 2, "w"));

		System.out.println("Append:" + sb.append(" sivgggfgastava"));

		System.out.println("Reverse = " + sb.reverse());
	}

}