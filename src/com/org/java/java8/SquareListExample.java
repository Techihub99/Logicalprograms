package com.org.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] itr= {1,2,3,4,5};
		Arrays.stream(itr).boxed().map(s1->s1*s1).filter(s2->s2>10).forEach(System.out::println);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.stream().map(s1->s1*s1).filter(s2->s2>8).forEach(System.out::println);
		
		
		

	}

}
