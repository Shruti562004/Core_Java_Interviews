
package com.rays.unchecked;

public class NullPointerTest {
	
	public static void main(String[] args) {
		
		String s=null;
		System.out.println(s);
		
		try {
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("exception "+e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			
			System.out.println("finaly block is always excuted");
		}
		
	}

}
