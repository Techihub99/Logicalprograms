package com.org.java.integer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DublicateExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []itr= {1,2,3,2,4,5,6,3};
		List<Integer> list=Arrays.stream(itr).boxed().collect(Collectors.toList());
		System.out.println(list);
		list.stream().filter(s1->Collections.frequency(list, s1)>1).collect(Collectors.toList()).forEach(System.out::println);
		
	

	}

}
