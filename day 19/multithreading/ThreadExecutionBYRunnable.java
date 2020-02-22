package com.cts.training.multithreading;

public class ThreadExecutionBYRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here we only have main thread
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);//8
		ThreadOneRunnable thread1 = new ThreadOneRunnable(); // new born state
		ThreadTwoRunnable thread2 = new ThreadTwoRunnable(); // new born state
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY+2);
		t1.start();// ready state
		t2.start();// ready state
		System.out.println("main thread priority : " + Thread.currentThread().getPriority());
		System.out.println(" thread priority : " + t1.getPriority());
		System.out.println(" thread priority : " + t2.getPriority());

	}

}
