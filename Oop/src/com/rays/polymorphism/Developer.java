package com.rays.polymorphism;

public class Developer  extends EmployeeArgs{
	 @Override
	    public void calculateSalary(double percentages) {

	       salary=salary+(salary*percentages/100);

	        System.out.println("Developer Salary: " + salary);
	    }
}
