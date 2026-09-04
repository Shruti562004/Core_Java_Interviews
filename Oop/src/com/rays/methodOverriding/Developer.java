package com.rays.methodOverriding;

public class Developer extends Employee {
 @Override
	public void calculateSalary(double percentages) {
	 if(salary>0&& percentages>0) {
		 salary=salary+(salary*percentages/100);
			System.out.println(" Developer salary after bonus "+salary);
	 }
		
	}
}
