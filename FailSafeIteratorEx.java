package com.csi.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorEx {
	public static void main(String[] args) {
		List<String> list =new CopyOnWriteArrayList<String>();

		
//		CopyOnWriteArrayList or ConcurrentHashMap are use to avoid the exception
		
		list.add("IT");
		list.add("CS");
		list.add("E&TC");
		list.add("Mechanical");
		list.add("Chemical");
		list.add(null);
		list.add(null);
		list.add("Civil");
		list.add("Electronics");
		list.add("Machine Learning");

//		System.out.println(list.size() + "\n" +list);
		
		Iterator<String>iterator = list.iterator();    
		
		while (iterator.hasNext()) {			
			list.add("DS");
			list.remove(4);
			String string = (String) iterator.next();
			System.out.println(string);
			

//			for(String branchname : list) {
//			list.add("Asc");
//				System.out.println(branchname);
//			}
		
		}
	}

}
