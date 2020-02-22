package Questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class WordSearch{

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String path = ("C:\\Users\\admin\\Desktop\\traininig\\file\\copy.txt");
		File file= new File(path); 
		String[] words = null; 
		FileReader filereader = new FileReader(file);  
		BufferedReader br = new BufferedReader(filereader); //buffer reader is used to take input 
		String s;
		String input = "cts"; 
		int count = 0; 
		while ((s = br.readLine()) != null) 
		{
			words = s.split(" "); 
			for (String word : words) {
				if (word.equals(input)) 
				{
					count++; 
				}
			}
		}
		if (count != 0) 
		{
			System.out.println("The given word is present for " + count + " Times in the file");
		} else {
			System.out.println("The given word is not present in the file");
		}

		filereader.close();
	}

}