package com.org.java.integer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []itr= {1,5,2,3,1,5,6,78,1,6,5};
		List<Integer> sort=Arrays.stream(itr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sort);

	}

}
