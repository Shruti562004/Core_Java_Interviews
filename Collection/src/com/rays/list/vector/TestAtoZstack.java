package com.rays.list.vector;



import java.util.Stack;

public class TestAtoZstack {

	public static void main(String[] args) {

		Stack s = new Stack();
		
		for(char ch ='a'; ch<='z'; ch++) {
			System.out.println(s.push(ch));
		}
		
		Stack s1 = new Stack();
		
		while(!s.empty()) {  //stack methods
		System.out.print(s1.push(s.pop()));
	}
		System.out.println();
	System.err.println(s);
	System.err.println(s1);
	}
}