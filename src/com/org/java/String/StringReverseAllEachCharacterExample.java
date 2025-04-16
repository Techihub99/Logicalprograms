package com.org.java.String;

public class StringReverseAllEachCharacterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello welcome to java";
		
		String[] words = str.split(" ");
		
		String reverse = "";
		
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revesewords="";
			for(int j=word.length()-1;j>=0;j--) {
				revesewords=revesewords+word.charAt(j);
			}
			reverse=reverse+revesewords+" ";	
		}
		System.out.println(reverse);// olleh emoclew ot avaj 
	}

}
