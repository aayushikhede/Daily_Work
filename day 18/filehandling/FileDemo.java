package com.cts.training.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws FileNotFoundException ,IOException {
		String path = ("C:\\Users\\admin\\Desktop\\traininig\\file\\data.txt");
       File file = new File(path);
       FileInputStream in = new FileInputStream(file);
	System.out.println("file name is :"+file.getName());
	System.out.println("file length :"+file.length());
	System.out.println("file parent :"+file.getParent());
	System.out.println("file length :"+file.getPath());
	System.out.println("file length :"+file.getTotalSpace());

	}
	
}
