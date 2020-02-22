package Questions;

import com.cts.training.multithreading.Resource;

public class TableTanis {

	public static void main(String[] args) {

		Player1 p1 = new Player1(); // new born state
		Player2 p2 = new Player2(); // new born state
		Thread t3 = new Thread(p1);
		Thread t4 = new Thread(p2);
		t3.start();// ready state
		t4.start();// ready state
	}
}