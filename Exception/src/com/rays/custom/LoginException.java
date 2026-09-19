package com.rays.custom;

public class LoginException extends Exception {

	public LoginException() {
		super("LoginId & Password Is Invalid");
	}
	public LoginException(String msg) {
		super(msg);
	}
}


