package com.cts.training.abstraction;

public abstract class X {
	public void display() {
		System.out.println("x");
		
	}
	public abstract int sleepingHours();
	{}

}
 class Child extends X{
	 String sing()
	 {
		 return "hindi songs";
	 }
	public int sleepingHours()
	{
		return 8;
	}
}
class Demo {
	public static void main(String args[])
	{   X x =new Child();
	    x.sleepingHours();
	   
		Child c = new Child();
		c.sleepingHours();
		c.sing();
	}
}
