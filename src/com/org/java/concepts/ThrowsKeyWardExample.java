package com.org.java.concepts;

import java.io.File;
import java.io.IOException;

public class ThrowsKeyWardExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		f.createNewFile();
		 Thread.sleep(10000);
	        System.out.println("Hello Geeks");
	}
	
}
