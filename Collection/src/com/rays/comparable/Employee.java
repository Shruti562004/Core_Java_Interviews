package com.rays.comparable;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	String dep;
	
	
	public Employee(int id,String name ,String dep) {
		this.id=id;
		this.name=name;
		this.dep=dep;
	}
	
	
	public String toString() {
		return id + " " +name +" " +dep;
	}


	@Override
	public int compareTo(Employee o) {
		if(this.name.equals(o.name)) {
			return 0;	
		}
		else if(this.name.compareTo(o.name)<0) {
			return -1;
		}
		else {
			return 1;
		}
	}
		
		
	}
