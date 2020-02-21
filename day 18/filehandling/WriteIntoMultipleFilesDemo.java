package com.cts.training.filehandling;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoMultipleFilesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path1 = ("C:\\Users\\admin\\Desktop\\traininig\\file\\data1.txt");
		String path2 = ("C:\\Users\\admin\\Desktop\\traininig\\file\\data2.txt");
		String path3 = ("C:\\Users\\admin\\Desktop\\traininig\\file\\data3.txt");
		String path4 = ("C:\\Users\\admin\\Desktop\\traininig\\file\\data4.txt");

		FileOutputStream out1 = new FileOutputStream(path1);
		FileOutputStream out2 = new FileOutputStream(path2);
		FileOutputStream out3 = new FileOutputStream(path3);
		FileOutputStream out4 = new FileOutputStream(path4);
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String data ="data to be written into the files";
		byte []b=data.getBytes();
	    bout.write(b);
	    bout.writeTo(out1);
	    bout.writeTo(out2);
	    bout.writeTo(out3);
	    bout.writeTo(out4);
	    
	    
	    
	 }

}
