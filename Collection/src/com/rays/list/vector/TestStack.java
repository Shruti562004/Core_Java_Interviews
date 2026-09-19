package com.rays.list.vector;

import java.util.Stack;

public class TestStack {
public static void main(String[] args) {
	
	Stack s = new Stack();
	
	s.push(10);
	s.push(10);
	s.push(20);
	s.push(null);
	s.push(30);
	s.push(40);
	
	System.out.println(s);
	
	System.out.println(s.push(78));
	System.out.println(s);
	System.out.println(s.pop()); //top  element ko remove karke return karta hai.
	System.out.println(s.peek()); //top  element ko sirf dekhta hai, remove nahi karta.
	
}
}