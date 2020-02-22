package com.cts.training.multithreading;

public class ThreadRtwo implements Runnable {
	Resource resource;

	public ThreadRtwo(Resource resource) {

		this.resource = resource;
	}

	@Override
	public void run() {
		try {
			resource.display("thread-2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
