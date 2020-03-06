import java.io.FileReader;
import java.io.IOException;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d = new demo();
		try {
			d.task2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("END OF MAIN");

	}

	void readData() throws IOException {
		FileReader fr = new FileReader("file.txt");
		int i = fr.read();
		System.out.println("hi" + i);
	}

	void task2() throws IOException {
		readData();
	}

}
