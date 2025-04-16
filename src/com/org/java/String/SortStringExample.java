package com.org.java.String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sreenivasarao";
		List<String> strSort=Arrays.stream(str.split("")).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		String listString = String.join("", strSort);
		System.out.println(listString);

	}

}
