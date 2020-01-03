package com.map;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IdentityHasmap {

	public static void main(String[] args) {
		IdentityHashMap<Integer, String> ihmap=new IdentityHashMap<>();
		ihmap.put(1, "ram");
		ihmap.put(2, "dille");
		ihmap.put(3, "rohit");
		ihmap.put(4, "jas");
		ihmap.put(5, "gouthami");
		IdentityHashMap<Integer, String> ihmap1=new IdentityHashMap<>();
		ihmap1.put(1, "ram");
		ihmap1.put(2, "dille");
		ihmap1.put(3, "rohit");
		ihmap1.put(4, "jas");
		ihmap1.put(5, "gouthami");
		if(ihmap.equals(ihmap1)){
			System.out.println("both are same");
		}else{
			System.out.println("both are not same");
		}
		for(Entry<Integer, String> map:ihmap.entrySet()){
			System.out.println(map.getKey()+" "+ map.getValue());
		}

	}

}
