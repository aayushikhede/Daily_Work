package com.cts.training.multithreading;

public class ThreadExecutionDemo {
	public static void main(String[] args) {
          //  System.out.println(Thread.currentThread().getName());
            //here we only have main thread
            ThreadOne threadOne = new ThreadOne();   //new born state
            threadOne.start();//ready state
            ThreadTwo thread2 = new ThreadTwo();   //new born state
            thread2.start();//ready state
      /*      for (int i = 0; i <=5; i++) {
            	System.out.println(Thread.currentThread().getName()+" : "+i);
				
			}*/
	}

}
