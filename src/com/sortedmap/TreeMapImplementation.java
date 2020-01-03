package com.sortedmap;

import java.util.TreeMap;

public class TreeMapImplementation {

	public static void main(String[] args) {
		TreeMap<Integer, String> tree_map 
        = new TreeMap<Integer, String>(); 

    // Mapping string values to int keys 
    tree_map.put(15, "Geeks"); 
    tree_map.put(10, "4"); 
    tree_map.put(20, "Geeks"); 
    tree_map.put(25, "Welcomes"); 
    tree_map.put(30, "You"); 

    // Displaying the TreeMap 
    System.out.println("TreeMap: "
                       + tree_map); 
} 

	}


