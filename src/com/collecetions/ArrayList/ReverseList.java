package com.collecetions.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		Collections.sort(list,Collections.reverseOrder());
		for(Integer i:list){
			System.out.println(i);
		}
		
	}

}
