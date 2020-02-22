package com.cts.training.multithreading;

public class ThreadRone implements Runnable {
	Resource resource;

	public ThreadRone(Resource resource) {

		this.resource = resource;
	}

	@Override
	public void run() {
		try {
			resource.display("thread-1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
