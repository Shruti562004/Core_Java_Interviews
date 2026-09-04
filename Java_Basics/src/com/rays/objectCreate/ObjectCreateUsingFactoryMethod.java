package com.rays.objectCreate;

import java.util.Calendar;

public class ObjectCreateUsingFactoryMethod {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Object created using factory method: " + c.getTime());
	}
}
