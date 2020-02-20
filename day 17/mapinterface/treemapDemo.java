package com.cts.training.mapinterface;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class treemapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> m = new TreeMap<String, String>();
		m.put("banana", "60");
		m.put("orange", "50");
		m.put("mango", "100");
		m.put("apple", "120");
		m.put("kiwi", "200");
		// m.put(null,"0");
		// m.put("water",null);
		for (Entry<String, String> entry : m.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}

	}

}
