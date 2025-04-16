package com.org.java.integer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10 , 20 , 30 , 40 };
		int[] b = {40, 50 , 30 , 70 , 80 };
		
		Object[] merged =Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed()).toArray();
		System.out.println(Arrays.toString(merged));
		List<Object> list=Arrays.stream(merged).collect(Collectors.toList());
		Collections.reverse(list);
		System.out.println(list);
	}

}
