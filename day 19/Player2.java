package Questions;

import com.cts.training.multithreading.Resource;

public class Player2 implements Runnable {

	@Override
	public void run() {

		System.out.println("player 2 ready : ");
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(250);
				System.out.println("<-Pong");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
