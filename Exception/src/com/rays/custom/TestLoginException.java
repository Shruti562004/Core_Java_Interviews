package com.rays.custom;

public class TestLoginException {
	public static void main(String[] args) {
		
		
		
		
		String name="Shruti";
		
		try {
		if(name.equals("Shrui")) {
			System.out.println("valid user");
		}
		
		else {
		
				throw new LoginException("Invalid login and [assword");
			} 
		}catch (LoginException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

