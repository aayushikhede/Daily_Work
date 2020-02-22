package com.cts.training.multithreading;

public class ThreadOneRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("thread 1 : " + i);

			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
