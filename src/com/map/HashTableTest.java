package com.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableTest {

	public static void main(String[] args) {
		
		String str;
		 
		Hashtable<String, String> hashtable = 
	              new Hashtable<String, String>();
	 
	   // Adding Key and Value pairs to Hashtable
	   hashtable.put("A", "Apple");
	   hashtable.put("B", "Orange");
	   hashtable.put("C", "Mango");
	   hashtable.put("D", "Banana");
	   hashtable.put("E", "Grapes");
	   //hashtable.put(null,"Mona");
	   Set<String> keys = hashtable.keySet();
	   Iterator<String> itr = keys.iterator();
	   while (itr.hasNext()) { 
	       // Getting Key
	        str = itr.next();
		     
		     System.out.println("Key: "+str+" & Value: "+hashtable.get(str));
		   }

	}

}
