package com.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreemapTest {

	public static void main(String[] args) {
		Map<Integer,String> tmap=new TreeMap<>();
		tmap.put(4, "zahir");
		tmap.put(2, "abi");
		tmap.put(3, "balu");
		tmap.put(1, "chandu");
		
		Set<Entry<Integer,String>> set=tmap.entrySet();
		for(Entry<Integer,String> map:set) {
			System.out.println(map.getKey()+" "+map.getValue());
		}

		
     
	}

}
