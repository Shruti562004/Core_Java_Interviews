package com.rays.comparator;

import java.util.Comparator;

public class EmployeeId  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	if(o1.id==o2.id){
		return o1.name.compareTo(o2.name);
		
	}
	
 return o1.id-o2.id;
	}

}
