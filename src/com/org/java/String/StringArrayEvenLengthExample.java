package com.org.java.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringArrayEvenLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]str= {"srinu","naresh","ajay","chowdary"};
		List<String> list=Arrays.stream(str).filter(s1->s1.length()%2==0).collect(Collectors.toList());
		System.out.println(list);

	}

}
