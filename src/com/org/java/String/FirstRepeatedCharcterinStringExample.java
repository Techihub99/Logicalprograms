package com.org.java.String;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharcterinStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sreenivasarao";
	String  fstRepeated=	Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream()
		.filter(s1->s1.getValue()>1).findAny().get().getKey();
	System.out.println(fstRepeated);
	
	List<Entry<String, Long>>  allRepeated=	Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream()
			.filter(s1->s1.getValue()>1).collect(Collectors.toList());
		System.out.println(allRepeated);

	}

}
