package com.org.java.String;

public class StringReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sreenivasarao";
		int length=str.length();
		
		for(int reverse=length-1;reverse>=0;reverse--) {
			System.out.print(str.charAt(reverse));
		}

	}

}
