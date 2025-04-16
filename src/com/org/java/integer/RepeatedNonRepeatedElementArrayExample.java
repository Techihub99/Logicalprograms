package com.org.java.integer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedNonRepeatedElementArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]itr={1,52,4,5,8,8,5,1,5,4,5,6,51,2};
		Map<Integer,Long> occurenc=Arrays.stream(itr).boxed().collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()));
		System.out.println("integer ocuurence is::"+occurenc);
		
		Integer firstrepeatedElement=Arrays.stream(itr).boxed().collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()))
				.entrySet().stream().filter(s1->s1.getValue()>1).skip(1).findAny().get().getKey();
		System.out.println(firstrepeatedElement);
		
		List<Entry<Integer,Long>> allrepeatedElement=Arrays.stream(itr).boxed().collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()))
				.entrySet().stream().filter(s1->s1.getValue()>1).collect(Collectors.toList());
		System.out.println(allrepeatedElement);
		
		Integer firstnonrepeatedElement=Arrays.stream(itr).boxed().collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()))
				.entrySet().stream().filter(s1->s1.getValue()==1).findAny().get().getKey();
		System.out.println(firstnonrepeatedElement);
		
		List<Entry<Integer,Long>> allNonrepeatedElement=Arrays.stream(itr).boxed().collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()))
				.entrySet().stream().filter(s1->s1.getValue()==1).collect(Collectors.toList());
		System.out.println(allNonrepeatedElement);

	}

}
