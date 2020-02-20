package com.cts.training.mapinterface;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapEntryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("banana", 60);
		m.put("orange", 50);
		m.put("mango", 100);
		m.put("apple", 120);
		m.put("kiwi", 200);
		
		for(Entry<String, Integer> entry :m.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
	}

}
