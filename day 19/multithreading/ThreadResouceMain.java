package com.cts.training.multithreading;

public class ThreadResouceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);//8
		Resource res = new Resource();
		ThreadRone thread1 = new ThreadRone(res); // new born state
		ThreadRtwo thread2 = new ThreadRtwo(res); // new born state
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY+2);
		t1.start();// ready state
		t2.start();// ready state

	}

}
