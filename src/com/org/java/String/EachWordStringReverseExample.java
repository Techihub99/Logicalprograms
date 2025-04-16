package com.org.java.String;

public class EachWordStringReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "hello,welcome,to,java";
		String[] str1=str.split(",");
		String reverse="";
		for(int i=str1.length-1;i>=0;i--) {
			reverse=reverse+str1[i]+" ";	
		}
		System.out.println(reverse);//java to welcome hello 

	}

}
