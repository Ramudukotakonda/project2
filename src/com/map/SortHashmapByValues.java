package com.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashmapByValues {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
		  
        hm.put("Math", 98); 
        hm.put("Data Structure", 85); 
        hm.put("Database", 91); 
        hm.put("Java", 95); 
        hm.put("Operating System", 79); 
        hm.put("ANetworking", 80); 
        
        Set<Entry<String, Integer>> entries = hm.entrySet();
        List<Entry<String,Integer>> list=new LinkedList<Entry<String,Integer>>(entries);
        Collections.sort(list,new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				//return o1.getValue().compareTo(o2.getValue());
				return o1.getKey().compareTo(o2.getKey());
			}
		});
        for(Map.Entry<String, Integer> map:list){
        	System.out.println(map.getKey()+"====> "+map.getValue());
        }
        
       
       /* Comparator<Entry<String, Integer>> valueComparator=new Comparator<Entry<String,Integer>>() {
        			@Override
					public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
						Integer i=o1.getValue();
						Integer i1=o2.getValue();
						
						return i.compareTo(i1);
					}
				};
				 // Sort method needs a List, so let's first convert Set to List in Java
				List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(entries);
				// sorting HashMap by values using comparator
				Collections.sort(listOfEntries,valueComparator);
				// copying entries from List to Map
		        LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>(listOfEntries.size());
				
				for(Entry<String, Integer> entry : listOfEntries){
		            sortedByValue.put(entry.getKey(), entry.getValue());
		        }
				 System.out.println("HashMap after sorting entries by values ");
				Set<Entry<String, Integer>> entrySetSortedByValue = sortedByValue.entrySet();
				
				for(Entry<String, Integer> mapping : entrySetSortedByValue){
		            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
		        }*/
	}
	
	
	
}
