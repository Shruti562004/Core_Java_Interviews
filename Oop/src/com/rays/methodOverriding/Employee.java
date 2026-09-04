package com.rays.methodOverriding;

public class Employee {
	
	public String name;
	public double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void calculateSalary(double percentages) {
		System.out.println("salary ");
		
	}

}
