package com.map;

import java.util.Map.Entry;
import java.util.WeakHashMap;

public class WeakHashmap1 {

	public static void main(String[] args) {
		WeakHashMap<Integer,String> wmap=new WeakHashMap<Integer,String>();
		
		wmap.put(1, "ramu");
		wmap.put(2, "dileep");
		wmap.put(3, "rohit");
		wmap.put(4, "jaswanth");
		
		wmap.put(null, "gouthami");
		System.gc();
     for(Entry<Integer, String> map:wmap.entrySet()){
    	 System.out.println(map.getKey()+" "+map.getValue());
     }
	}

}
