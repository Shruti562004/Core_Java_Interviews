package com.rays.methodOverriding;

public class EmployeeTest {
public static void main(String[] args) {
	
	Manager m=new Manager();
    m.setName("Sandeep");
    m.setSalary(20000);
	m.calculateSalary(4);
	Developer d=new Developer();
    d.setName("Chinu");
    d.setSalary(50000);
	d.calculateSalary(7);
}
}
