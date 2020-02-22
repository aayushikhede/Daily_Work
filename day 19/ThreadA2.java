package Questions;

public class ThreadA2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n = 4;

		for (int i = 1; i <= 10; i++) {
			{
				System.out.println("thread 2  : table of 4 " + i * n);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
