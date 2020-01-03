package com.collecetions.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.add("G");
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add("F");
		
		System.out.println(s);
		System.out.println("size of stack"+s.size());
		System.out.println("capacity of stack"+s.capacity());
		System.out.println(s.contains("G"));
		System.out.println(s.get(3));
		System.out.println(s.containsAll(s));
		System.out.println("first element"+s.firstElement());
		System.out.println("last elemnet"+s.lastElement());
		
		System.out.println(s.empty());
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.search("F"));
		System.out.println(s.elementAt(2));
		System.out.println(s.push("H"));

		for(String st:s){
			System.out.println("forloop"+st);
		}
		System.out.println(s.hashCode());
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()){
			System.out.println("while loop"+itr.next());
		}
		
		
    
	}

}
