package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestHashmap {

	public static void main(String[] args) {
		Map<Integer, String> hmap=new HashMap<>();
		
		hmap.put(6, "ram");
		hmap.put(6, "gouthami");
		hmap.put(4, "dileep");
		hmap.put(5, "rohit");
		hmap.put(3, "abi");
		hmap.put(2, "chandu");
		hmap.put(1, "zahir");
	
		
		/*TreeMap<Integer, String> treemap= new TreeMap<Integer,String>(hmap);
		Set<Entry<Integer, String>> set=treemap.entrySet();
		for(Map.Entry<Integer,String> map:set){
			System.out.println("Keys"+map.getKey()+"===Value"+map.getValue());
			
		}
		*/
	}

}
