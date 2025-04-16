package com.org.java.String;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacterInStringExample {

	public static void main(String[] args) {
		String str="sreenivasrao";
		List<Entry<String, Long>> fstnonrepeated=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream()
		.filter(s1->s1.getValue()==1).collect(Collectors.toList());
		System.out.println(fstnonrepeated);

	}

}
