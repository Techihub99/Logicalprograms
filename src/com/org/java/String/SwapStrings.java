package com.org.java.String;

public class SwapStrings {
	public static void main(String[] args) {
		
		  String str1="Good"; String str2="morinning";
		  str1=str1+str2;//Good morinning
		  str2=str1.substring(0,str1.length()-str2.length());//Good
		  str1=str1.substring(str2.length());//morinning
		  System.out.println("swap after String::"+str1+";;"+str2 );
		  
		  
		  
		  String str3="srinu"; 
		  String str4="kontemukkula";
		  String str5;
		  str5=str3;
		  str3=str4;
		  str4=str5;
		  System.out.println("after swapping strings are::"+str3+"::"+str4);
		 

		int num1 = 10;
		int num2 = 20;
		int num3;
		num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("after swapping numbers are::" + num1 + "  " + num2);
		
		
		int num4 = 100;
		int num5 = 200;
		num4=num4+num5;//300
		num5=num4-num5;//100
		num4=num4-num5;//200
		System.out.println("after swapping numbers are::" + num4 + "  " + num5);
		

	}
}
