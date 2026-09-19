package com.rays.comparator;

import java.util.Comparator;

public class EmployeeAll implements Comparator<Employee> {
public int compare(Employee o1, Employee o2) {
	if(o1.id==o2.id || o1.name==o2.name) {
		
		return o1.salary-o2.salary;
	}
	
	else if(o1.salary==o2.salary) {
		return o1.name.compareTo(o2.name);
	}
	
	return o1.id-o2.id;
}
}
