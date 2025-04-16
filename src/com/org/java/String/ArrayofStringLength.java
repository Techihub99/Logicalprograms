package com.org.java.String;

import java.util.Arrays;

public class ArrayofStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []str= {"srinu","naresh","suresh","sreenivasarao","naveenkumar"};
		int length=str.length;
		System.out.println(length);
		
		long lengthis=Arrays.stream(str).mapToInt(String::length).count();
		System.out.println("java8 length is::"+lengthis);
	
	}
}
