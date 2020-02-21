package com.cts.training.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputStreamDemo {

	public static void main(String[] args)  throws FileNotFoundException ,IOException{
		// TODO Auto-generated method stub
		String path = ("C:\\Users\\admin\\Desktop\\traininig\\file\\data.txt");
		String path2= ("C:\\Users\\admin\\Desktop\\traininig\\file\\copy.txt");
		File file = new File(path);
	       FileInputStream in = new FileInputStream(file);
	      
       BufferedInputStream bin = new BufferedInputStream(in);
       FileOutputStream out= new FileOutputStream(path2);
       BufferedOutputStream bout = new BufferedOutputStream(out);
      // bout.close();
       //bout.flush();
   	
		int i ;
		while((i = in.read())!= -1)
		{
	//	System.out.println((char)i);	
			bout.write(i);
		} bout.close();
		
			
	}

}
