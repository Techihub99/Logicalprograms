package com.org.java.integer;

import java.util.Arrays;
import java.util.Comparator;


public class LargestSmallestNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []itr= {1,5,2,3,1,5,6,78,1,6,48,5};
		int max=Arrays.stream(itr).boxed().max(Comparator.naturalOrder()).get();
		System.out.println(max);
		int min=Arrays.stream(itr).boxed().min(Comparator.naturalOrder()).get();
		System.out.println(min);
		
		Integer secondHigestNuber=Arrays.stream(itr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondHigestNuber);
		
		Integer secondLowestNuber=Arrays.stream(itr).boxed().distinct().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
		System.out.println(secondLowestNuber);
		}

}
