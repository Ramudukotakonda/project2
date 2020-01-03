package com.collecetions.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class RevesrCustomPojoArrayList {
	
	

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>(); 
        Employee emp1 = new Employee(123, "Rama", "Facilities"); 
        Employee emp2 = new Employee(124, "Lakshman", "Transport"); 
        Employee emp3 = new Employee(125, "Ravan", "Packing"); 
        al.add(emp1); 
        al.add(emp2); 
        al.add(emp3); 
  
       for(int i=al.size()-1;i>=0;i--){
    	   System.out.println("revers order"+al.get(i));
       }
         
			
	}

	
		
	}


