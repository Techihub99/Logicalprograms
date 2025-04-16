package com.org.java.String;

public class StringExample {

	public static void main(String[] args) {
		String str1="srinu";
		String str2="srinu";
		String str3=new String("srinu");
		String str4=new String("srin");
		str4=str4.concat("u");
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		String str5="SRINU";
		String str6="sreenivasarao";
		String str7="sreenivasa";
		str7=str7.concat("rao");
		String str8=new String("SRINU");
		StringBuffer sb=new StringBuffer("srinu");
		String s11="test1";
		String s12="te";
		s12=s12.concat("st1");
		System.out.println(s11==s12);//false
		System.out.println(s11.equals(s12));//true
		
		System.out.println(str6==str7);//false
		System.out.println(str6.equals(str7));//true
		
		
		System.out.println("test"+str1.equals(sb));//true
		System.out.println(str1==str2);//true
		System.out.println(str1.equals(str2));//true
		System.out.println(str1==str3);//false
		System.out.println(str1.equals(str3));//true
		System.out.println(str3==str4);//false
		System.out.println(str3.equals(str4));//true
		System.out.println(str1==str5);//false
		System.out.println(str1.equals(str5));//false
		System.out.println(str1.equalsIgnoreCase(str5));//true
		System.out.println(str5.equals(str8));//true
		System.out.println(str3.equalsIgnoreCase(str8));//true
		System.out.println(str6==str7);//false
		System.out.println(str6.equals(str7));//true

	}

}
