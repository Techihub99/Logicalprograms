package com.org.java.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "sreenivasarao";
		char[] ch = str.toCharArray();
		Map<String, Long> occurence = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
		System.out.println(occurence);

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character char1 : ch) {
			if (map.containsKey(char1)) {
				map.put(char1, map.get(char1) + 1);
			} else {
				map.put(char1, +1);
			}

		}
System.out.println(map);
	}

}
