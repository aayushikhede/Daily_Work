package com.cts.training.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void serialize(Employee employee, String path) {

		try {
			FileOutputStream fout = new FileOutputStream(path);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			ObjectOutputStream out = new ObjectOutputStream(bout);
			out.writeObject(employee);
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}}
       public static Object deserialize(String filepath)
       {
    	 
		try {
			 FileInputStream fi = new FileInputStream(filepath);
			 BufferedInputStream bi = new BufferedInputStream(fi);
	    	   ObjectInputStream oi = new ObjectInputStream(bi);
	    	   Object obj = oi.readObject();
	    	   oi.close();
	    	   return obj;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    	  
       }
	

	public static void main(String[] args) {
		//Employee employee = new Employee(101, "Aashi", "Pune", "Developer", 22, 20000, 1234567890);
		//serialize(employee, "employee.txt");
		//System.out.println("object saved successfully");
		Employee employee = (Employee) deserialize("employee.txt");
		System.out.println(employee);
	}

}
