package com.sortedmap;

import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemaptest {

	public static void main(String[] args) {
		
		TreeMap<Student, Integer> tmap = new TreeMap<Student, Integer>(new SortbyId());
		tmap.put(new Student(5, "bbbb"), 1); 
		tmap.put(new Student(10, "aaaa"), 2); 
		tmap.put(new Student(2, "cccc"), 3); 
	        
	      
	         Set<Entry<Student,Integer>> set=tmap.entrySet();
	         for(Map.Entry<Student, Integer> map:set){
	        	 System.out.println("key"+map.getKey()+"value" +map.getValue());
	         }
	        
	     
                    
	}

}
