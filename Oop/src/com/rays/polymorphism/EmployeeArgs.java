package com.rays.polymorphism;

public class EmployeeArgs {

	
	public double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
    public void calculateSalary(double percentages) {
        System.out.println("Employee Salary: " + salary);
    }
	
}
