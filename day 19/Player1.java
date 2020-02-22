package Questions;

import com.cts.training.multithreading.Resource;

public class Player1 implements Runnable {
	@Override
	public void run() {

		System.out.println("player 1 ready : ");
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(250);
				System.out.println("Ping->");
			} catch (InterruptedException e) {
// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}
}
