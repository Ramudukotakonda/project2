package com.collecetions.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArraySubList {

	public static void main(String[] args) {
		
		 ArrayList<Integer> al=new ArrayList<Integer>();  
		 al.add(1);
		 al.add(2);
		 al.add(3);
		 al.add(4);
		 al.add(5);
		 al.add(6);
	     
	      System.out.println(al.indexOf(4));
	      for(Integer i:al){
	    	  System.out.println(i);
	      }
	      
}
}