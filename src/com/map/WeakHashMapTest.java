package com.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class WeakHashMapTest {

	public static void main(String[] args) throws InterruptedException {
		
		final Map<Key, Project> map = new WeakHashMap<>();
        Key key1 = new Key("ACTIVE");
        final Key key2 = new Key("INACTIVE");
        map.put(key1, new Project(100, "Customer Management System", "Customer Management System"));
        map.put(key2, new Project(200, "Employee Management System", "Employee Management System"));
        key1 = null;
        System.gc();
        for (final Entry<Key, Project> entry : map.entrySet()) {
            System.out.println(entry.getKey().getKey() + "   " + entry.getValue());
        }
	      
	      
	}

}
