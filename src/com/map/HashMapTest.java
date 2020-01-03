package com.map;

import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Integer, Employee> hmap=new HashMap<>();
		
		Employee e1=new Employee(1, "Ramudu", 430);
		Employee e2=new Employee(2, "dileep", 289);
		Employee e3=new Employee(3, "rohit", 100);
		Employee e4=new Employee(4, "gouthami", 200);
		
		hmap.put(4, e4);
		hmap.put(1, e1);
		hmap.put(2, e2);
		hmap.put(3, e3);
		
		Set<Map.Entry<Integer, Employee>> set=hmap.entrySet();
		for(Map.Entry<Integer, Employee> map:set){
			System.out.println("key"+map.getKey()+"value"+map.getValue());
		}
		
		

	}

}
