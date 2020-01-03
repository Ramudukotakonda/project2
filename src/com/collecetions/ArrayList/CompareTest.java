package com.collecetions.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTest {
	public static void main(String[] args) {
		CompareTest ct =new CompareTest();
		ct.compare();
	}
	
	
	String filedName = "id";
	
	List<Employee> list1 = new ArrayList<Employee>();
	
	public CompareTest() {
		Employee emp1 = new Employee(4, "Ramu","Productio");
		Employee emp2 = new Employee(3, "abi","HR");
		Employee emp3 = new Employee(2, "Charan","Testing");
		Employee emp4 = new Employee(1, "Dileep","Admin");

		list1.add(emp1);
		list1.add(emp2);
		list1.add(emp3);
		
		list1.add(emp4);
	}
	
	
	 private  void compare() {
		 
		 switch(filedName) 
	        { 
	            case "id": 
	            	Collections.sort(list1, new IdComparator());
	            	printList();
	                break; 
	            case "name": 
	            	Collections.sort(list1, new NameComprator()); 
	            	printList();
	                break; 
	            case "departname": 
	            	Collections.sort(list1,new DepartComarator());
	            	printList();
	                break; 
	            default: 
	                System.out.println("no match"); 
	        } 
			
		
	}

	private  void printList() {
		for (Employee emp : list1) {
			System.out.println(emp);
		}
		
	}

	

}
