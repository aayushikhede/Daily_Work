package com.cts.training.collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIteratorDemo1 {

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

		ListIterator<String> li = list.listIterator();
		System.out.println("*******forword*******");
		while (li.hasNext()) {
			String e = li.next();
			System.out.println(e);
			if (e.equals("java")) {
				break;
			}

		}
		System.out.println("*******backword*******");

		while (li.hasPrevious()) {
			String e = li.previous();
			System.out.println(e);
		}
		System.out.println("the object of index is ");
	}

}
