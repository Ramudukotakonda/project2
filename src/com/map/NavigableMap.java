package com.map;

public class NavigableMap {

	
	public static void main(String[] args) {
		
		int x=1;
		int y=2;
		int z=3;
		
		x=x+y+z;
		y=x-(y+z);
		z=x-(y+z);
		x=x-(y+z);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
