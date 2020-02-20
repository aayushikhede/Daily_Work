package com.cts.training.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("banana", 60);
		m.put("orange", 50);
		m.put("mango", 100);
		m.put("apple", 120);
		m.put("kiwi", 200);
		m.put("banana", 80);
		m.put(null,0);
		
		System.out.println(m);
		System.out.println(m.get("apple"));
		System.out.println(m.containsKey("kiwi"));
		System.out.println(m.clone());
		System.out.println(m.containsValue(80));
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		m.remove("banana",80);
		System.out.println(m);
		m.replace("kiwi", 200, 100);
		System.out.println(m);
		m.putIfAbsent("grapes", 100);
		System.out.println(m);
		
		
		
	}

}
