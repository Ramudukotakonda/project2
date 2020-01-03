package com.collecetions.ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncronizedList {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		list.add("Ramu");
		list.add("rohit");
		list.add("dilee");
		list.add("jaswanth");
		
		list=Collections.synchronizedList(list);
		
		synchronized (list) {
			for(String str:list){
				System.out.println(str);
			}
		}
	}
	

}
