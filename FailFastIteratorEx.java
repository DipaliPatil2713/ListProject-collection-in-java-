package com.csi.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FailFastIteratorEx {
	public static void main(String[] args) {
		List<String> list =new LinkedList<String>();

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
			list.add("Swara");
			
//			Here it with throws ConcurrentModificationException if you want to not come this exception 
//			Simply use CopyOnWriteArrayList & ConcurrentHashMap instead of LinkedList and any other
			
			String string = (String) iterator.next();
			System.out.println(string);
			
//			for(String branchname : list) {
//				list.add("Asc");
//					System.out.println(branchname);
//				}
//			list.add("sdsd");
//			list.forEach(Branch -> System.out.println(Branch));
			
		}
	}

}
