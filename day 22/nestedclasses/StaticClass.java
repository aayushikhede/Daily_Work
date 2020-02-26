package com.cts.training.nestedclasses;

public class StaticClass {
int x=10;
static int y=20;
	
	static class inner {}
	{
		System.out.println(y);
	}
	public static void main(String[] args) {
		StaticClass.inner v= new StaticClass.inner();
	}

}
