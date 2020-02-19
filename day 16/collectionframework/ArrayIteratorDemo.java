package com.cts.training.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList();
		// List l =new ArrayList();

		list.add("hello");
		list.add("to");
		list.add("java");
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
