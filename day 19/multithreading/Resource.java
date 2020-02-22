package com.cts.training.multithreading;

public class Resource {
	public  void display(String name) 
	{
		synchronized(this){
	
		for (int i = 1; i <= 5; i++) {
			System.out.println("name count : " + i + " " + name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}

}
