package com.cts.training.generics;

import java.util.ArrayList;
import java.util.List;


public class WithoutGenerics {

	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

        public static void main(String args[]){
		WithoutGenerics type = new WithoutGenerics();
		type.set("aayushi"); 
		String str = (String) type.get();
		System.out.println(str);
		type.set(5); 
		int i= (Integer) type.get();
		System.out.println(i);
	}
}
	


	
	
	
	
	
