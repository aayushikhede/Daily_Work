package com.cts.training.multithreading;

public class MultiThreadingDemo {

	public static void main(String[] args) {
	//Thread t = new Thread();
	
	Thread t1 = Thread.currentThread();
	System.out.println(t1);
	System.out.println(t1.getName());
	t1.setName("Thread1");
	System.out.println(t1);
	System.out.println(t1.getPriority());
	System.out.println("is daemon :"+t1.isDaemon());
	System.out.println("is alive : "+t1.isAlive());
	}

}
