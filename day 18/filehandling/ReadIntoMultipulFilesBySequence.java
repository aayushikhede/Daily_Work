package com.cts.training.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

public class ReadIntoMultipulFilesBySequence {

	public static void main(String[] args)throws FileNotFoundException, IOException {
		
		String path1 = ("C:\\Users\\admin\\Desktop\\traininig\\file\\data1.txt");
		String path2 = ("C:\\Users\\admin\\Desktop\\traininig\\file\\data2.txt");
		String path3 = ("C:\\Users\\admin\\Desktop\\traininig\\file\\data3.txt");
	   String path4 = ("C:\\Users\\admin\\Desktop\\traininig\\file\\data4.txt");
           FileInputStream in1 = new FileInputStream(path1);
           FileInputStream in2 = new FileInputStream(path2);
           FileInputStream in3 = new FileInputStream(path1);
           FileInputStream in4 = new FileInputStream(path2);
           SequenceInputStream sin = new SequenceInputStream(in1,in2);// cannot used for more than two files
       	
   		int i ;
   		while((i = sin.read())!= -1)
   		{
   	//	System.out.println((char)i);	
   			System.out.print((char)i);
   		}
   			
	}

}
