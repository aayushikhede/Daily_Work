package com.cts.training.collectionframework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		// List l =new ArrayList();

		list.add("hello");
		list.add("to");
		list.add("java");
		list.add("batch");
		list.add("7");
		list.add("true");
        
		System.out.println(list);
		list.remove(2);
		list.add(2, "advance java");
		System.out.println("list contains python ? "+list.contains("Python"));
		System.out.println("list size "+list.size());
		
		for (String o : list) {
	
			System.out.println(o);
			if(o.equals("batch"))
			{
				break;
			}
		  }
	}

}
