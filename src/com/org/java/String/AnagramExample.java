package com.org.java.String;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="abcD";
		String str2="dBac";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean result=Arrays.equals(ch1, ch2);
		System.out.println(result);// Anagram means both string are same characters
		
	}

}
