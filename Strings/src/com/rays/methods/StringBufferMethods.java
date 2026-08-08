package com.rays.methods;

public class StringBufferMethods {
	public static void main(String[] args) {
		

	StringBuffer sb=new StringBuffer("Shrutii");
  StringBuffer s2=sb.append(" Rathore");
  System.out.println(s2);
  
  System.out.println(sb.insert(3 ,"o"));
  System.out.println(sb.delete(5, 6));
  
  System.out.println(sb.reverse());
  
  
  System.out.println(sb.capacity());
}
}