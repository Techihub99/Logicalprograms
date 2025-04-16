package com.org.java.String;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCharacterAllExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sreenivasarao";
		Map<String, Long> occurence = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println("string occurence is::" + occurence);

		Map<String, Long> sortOccurence = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
		System.out.println("string sort occurence is::" + sortOccurence);

		String firstRepectedCharacter = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(s1 -> s1.getValue() > 1).findFirst().get().getKey();
		System.out.println("first repeated character is::" + firstRepectedCharacter);

		List<Entry> AllRepectedCharacter = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(s1 -> s1.getValue() > 1).collect(Collectors.toList());
		System.out.println("all repeated character is::" + AllRepectedCharacter);

		String firstNonRepeatedChar = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(s1 -> s1.getValue() == 1).findFirst().get().getKey();
		System.out.println("first non repeated character is::" + firstNonRepeatedChar);

		String secondNonRepeatedChar = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(s1 -> s1.getValue() == 1).skip(2).findFirst().get().getKey();
		System.out.println("first non repeated character is::" + secondNonRepeatedChar);
		
		List<Entry> allNonRepeatedChar = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(s1 -> s1.getValue() == 1).collect(Collectors.toList());
		System.out.println("first non repeated character is::" + allNonRepeatedChar);

	}

}
