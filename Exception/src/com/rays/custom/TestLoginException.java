package com.rays.custom;

public class TestLoginException {
	public static void main(String[] args) {
		
		
		
		
		String name="Shruti";
		
		String password="pass@123";
		
		try {
		if(name.equals("hruti") && password.equals("pass@123")) {
			System.out.println("valid user");
		}
		
		else {
		  System.out.println("invalid");
				throw new LoginException("Invalid login and password");
			} 
		}catch (LoginException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

