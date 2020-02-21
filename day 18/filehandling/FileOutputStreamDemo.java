package com.cts.training.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException ,IOException{
		String path = ("C:\\Users\\admin\\Desktop\\traininig\\file\\data.txt");
		FileOutputStream out = new  FileOutputStream(path,true);
		String  msg=" cts training pune bath 07 joined on28 jan ";
	byte b[]=msg.getBytes();
	out.write(b);
	out.close();
	
	}

}
