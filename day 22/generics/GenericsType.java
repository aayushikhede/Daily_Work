package com.cts.training.generics;


public class GenericsType<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	public static void main(String args[]){
		GenericsType<String> type = new GenericsType<>();
		type.set("aayushi"); 
		String n = type.get();
		System.out.println(n);
		
		GenericsType<Integer> type2 = new GenericsType<>();
		type2.set(5);
		int i =type2.get();
		System.out.println(i);
	}


	}


