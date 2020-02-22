package Questions;

import com.cts.training.multithreading.ThreadOne;
import com.cts.training.multithreading.ThreadTwo;

public class ThreadActivity {
public static void main(String[] args) {
	  ThreadA1 t1 = new ThreadA1();   //new born state
      ThreadA2 t2= new ThreadA2();   //new born state
      Thread t3 = new Thread(t1);
      Thread t4 = new Thread(t2);
      t3.start();//ready state
      t4.start();//ready state
}
}
