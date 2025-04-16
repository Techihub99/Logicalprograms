package com.org.java.concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	 int studentId;
	 String studentName;
	
	public Student(int studentId,String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
		
	}
}

public class SerlizationExample   {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student s=new Student(101, "rakesh");
		
		FileOutputStream fos=new FileOutputStream("D:\\MyData");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		System.out.println("sucesss");
		
		FileInputStream Fis=new FileInputStream("D:\\MyData");
		ObjectInputStream ois=new ObjectInputStream(Fis);
	Student s1=(Student)ois.readObject();
	System.out.println(s1.studentId+" "+s1.studentName);  
	  //closing the stream  
	
		
		
	}

}
