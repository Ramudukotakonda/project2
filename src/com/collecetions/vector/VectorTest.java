package com.collecetions.vector;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
        v.addElement("G");
        v.add("E");
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.addElement("F");
        
        Vector<String> v1=new Vector<String>();
        v1.addElement("G");
        v1.add("E");
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");
        v1.addElement("h");
        System.out.println("size"+v.size());
        System.out.println(v.get(3));
        System.out.println("first element=="+v.firstElement());
        System.out.println("last element=="+v.lastElement());
        System.out.println(v.equals(v1));
        System.out.println(v.hashCode());
        System.out.println(v1.hashCode());
        if(v.equals(v1)){
        	System.out.println("hascode same");
        }else{
        	System.out.println("hashcode not sames");
        }
        System.out.println(v.isEmpty());
        System.out.println(v.remove("G"));
        System.out.println(v.removeAll(v));
        System.out.println(v1.set(3, "Z"));
        System.out.println(v1);
        
        
      Iterator<String> itr=v1.iterator();
        while(itr.hasNext()){
        	System.out.println("vecotor values==="+itr.next());
        }
        
        Enumeration<String> er=v1.elements();
        while(er.hasMoreElements()){
        	System.out.println(er.nextElement());
        }
        
        for(String str:v1){
        	System.out.println("for loop "+str);
        }
	}

}
