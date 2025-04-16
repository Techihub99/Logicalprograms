package com.org.java.integer;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DublicateArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []itr= {1,5,2,3,1,5,6,78,1,6,5};
	List<Integer> removeDublicates=Arrays.stream(itr).boxed().distinct().collect(Collectors.toList());
	System.out.println(removeDublicates);
	
	Set<Integer> Dublicates=Arrays.stream(itr).boxed().collect(Collectors.toSet());
	System.out.println(Dublicates);
	
	List<Entry<Integer, Long>> onlyDublicatesPrint=Arrays.stream(itr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet().stream().filter(s1->s1.getValue()>1).collect(Collectors.toList());
	System.out.println(onlyDublicatesPrint);

	}

}
