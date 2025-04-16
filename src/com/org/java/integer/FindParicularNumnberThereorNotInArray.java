package com.org.java.integer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindParicularNumnberThereorNotInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]itr= {15,020,12,5,8,8,6,1,22,4};
		boolean result=Arrays.stream(itr).boxed().anyMatch(s1->s1==16);
		System.out.println(result);

	}

}
