package com.org.java.integer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortArrayOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []itr= {2,5,8,4,5,6,5,4,8,88,6,1,2,0,5,7,6,8};
		List<Integer> ascSort=Arrays.stream(itr).boxed().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(ascSort);
		
		List<Integer> dscSort=Arrays.stream(itr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(dscSort);
		
		Set<Integer> afterRemoveDublicates=Arrays.stream(itr).boxed().distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toSet());
		System.out.println(afterRemoveDublicates);
		Set<Integer> set=new HashSet<Integer>();
		
		List<Integer> printDublicates=Arrays.stream(itr).boxed().filter(s1->!set.add(s1)).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(set);
		System.out.println(printDublicates);
		System.out.println(set);
		List<Entry<Integer, Long>> printDublicatesOccurence=Arrays.stream(itr).boxed().collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()))
				.entrySet().stream().filter(s1->s1.getValue()>1).collect(Collectors.toList());
		
		System.out.println(printDublicatesOccurence);

	}

}
