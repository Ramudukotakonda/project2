package com.collecetions.ArrayList;

import java.util.Comparator;

public class DepartComarator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getDeport().compareToIgnoreCase(o2.getDeport());
	}

}
