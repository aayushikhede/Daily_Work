package com.cts.training.mapinterface;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> m = new Hashtable<String, String>();
		m.put("banana", "60");
		m.put("orange", "50");
		m.put("mango", "100");
		m.put("apple", "120");
		m.put("kiwi", "200");
		//m.put(null,"0");
		//m.put("water",null);
		for(Entry<String, String> entry :m.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
	}
	}


