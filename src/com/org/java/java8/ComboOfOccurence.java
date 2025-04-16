package com.org.java.java8;

import java.util.Arrays;

import java.util.Map;
import java.util.TreeMap;

import java.util.function.Function;
import java.util.stream.Collectors;

public class ComboOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []itr= {1,2,3,4,5,6,33,7,4,5,6,4,5,6,45};
		Map<Integer,Long> occurence= Arrays.stream(itr).boxed().collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()));
		System.out.println("Occurence of each Character"+occurence);
		
		Integer firstNonRepeatedElement= Arrays.stream(itr).boxed().collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()))
				.entrySet().stream().filter(s1->s1.getValue()==1).findFirst().get().getKey();
		
		System.out.println("firstNonRepeatedElement value is::"+firstNonRepeatedElement);
		
		Integer firstRepeatedElement= Arrays.stream(itr).boxed().collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()))
				.entrySet().stream().filter(s1->s1.getValue()>1).skip(1).findFirst().get().getKey();
		
		System.out.println("firstRepeatedElement value is::"+firstRepeatedElement);

	}

}
