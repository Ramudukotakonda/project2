package com.collecetions.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayasList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println("size"+al.size());
		
		
		
		Collections.sort(al,Collections.reverseOrder());
		
		for(Integer i:al){
			System.out.println(i);
			
		}
		
		 ArrayList<String> arrList = new ArrayList<String>();
	        String[] items = { "One", "Two", "Three", "Four", "Five" };
	        System.out.println(items.length);
	        for(String str: items){
	           System.out.println(arrList.add(str));
	        }
	}
	

}
