package com.rays.encapsulation;

import java.util.Date;

public class Person {

	public String name;
	public String address;
	public Date dateOfBirth;
	
	
	public void setName(String name) {
		
		this.name=name;
		
	}
	
	public String getName() {
		
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


}
