package com.org.java.String;

import java.util.Arrays;

public class LongestAndSmallestStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []str={"sreenivasarao","naresh","ajay","saikumar"};
		String longest=Arrays.stream(str).reduce((word1,word2)->word1.length()>word2.length()? word1:word2).get();
		System.out.println("longest string is:::"+longest);
		String smallest=Arrays.stream(str).reduce((word1,word2)->word2.length()>word1.length()?word1:word2).get();
		System.out.println("smallest string is::"+smallest);

	}

}
