package com.cts.training.collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> list = new TreeSet<String>();
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
