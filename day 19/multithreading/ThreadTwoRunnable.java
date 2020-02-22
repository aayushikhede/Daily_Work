package com.cts.training.multithreading;

public class ThreadTwoRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10 ;i++)
		{if(i%2== 0)
		{
			System.out.println("thread 2 : " +i);
		}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
	}

}
