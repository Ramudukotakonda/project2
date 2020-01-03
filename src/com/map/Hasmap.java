package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hasmap {

	public static void main(String[] args) {
Map<Integer, String> hmap=new HashMap<>();
		
		hmap.put(null, "ram");
		hmap.put(1, "gouthami");
		hmap.put(2, "dileep");
		hmap.put(3, "rohit");
		hmap.put(4, "abi");
		hmap.put(5, "chandu");
		hmap.put(6, "zahir");
		
		System.out.println(hmap.get(null)); //return ram
		System.out.println(hmap.equals(null));  // false
		Set<Entry<Integer,String>> set=hmap.entrySet();
		for(Entry<Integer,String> map:set) {
			System.out.println(map.getKey()+" "+map.getValue());
		}

	}

}
