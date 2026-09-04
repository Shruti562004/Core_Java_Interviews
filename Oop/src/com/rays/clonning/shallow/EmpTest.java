package com.rays.clonning.shallow;

 class Emp implements Cloneable{
	int age=2;
	Company company;
	public Object clone() throws CloneNotSupportedException {
		
		return  super.clone();
		
	}
	
	
}
public class EmpTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp e=new Emp();
	
	e.company=new Company(); //company
	Emp e1=(Emp) e.clone();
		e.company.name="TCS";
				
				
	System.out.println("before");
	System.out.println(e.age);
	System.out.println(e.company.name);
	System.out.println(e1.age);
	System.out.println(e1.company.name);
	
	e1.age=44;
	e1.company.name="Wipro";
System.out.println("after");
System.out.println(e.age);
System.out.println(e.company.name);
System.out.println(e1.age);
System.out.println(e1.company.name);
	
	}

}
