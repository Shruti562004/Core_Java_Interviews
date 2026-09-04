package com.rays.encapsulation;

public class EmployeeTest {
public static void main(String[] args) {
	
	
	Employee em=new Employee();
	
	em.setId(1);
	em.setName("sandeep");
	
	em.setSalary(2000);
	
	em.incrementSalary(3);
	
	System.out.println("id "+em.getId());
	System.out.println("name " +em.getName());
	
	System.out.println("salary "+em.getSalary());
}
}
