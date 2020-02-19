package com.cts.training.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> list = new HashSet();
		// List l =new ArrayList();

		list.add("hello");
		list.add("to");
		list.add("java");
		list.add("batch");
		list.add("batch");
		list.add("batch");
		list.add("7");
		list.add("true");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}

		
	}

}
