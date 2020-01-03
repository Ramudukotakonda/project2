package com.collecetions.ArrayList;

import java.util.ArrayList;

public class RversListCustom {

    
	
	
	public static void main(String[] args) {
		 
        ArrayList<Integer> al = new ArrayList<Integer>(); 
  
        // Appending elements at the end of the list 
        al.add(1); 
        al.add(2); 
        al.add(3); 
        al.add(4); 
        
        for(int i=al.size()-1;i>=0;i--){
			
        	System.out.println("list  "+al.get(i));
		}

	}
	
	
	
	
	
}
