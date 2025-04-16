package com.org.java.predifinedjava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(58);
		list.add(3);
		list.add(8);
		list.add(98);
		list.add(1);
		list.add(12);
		list.add(58);
		list.add(528);
		list.add(518);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Comparator<Integer> c=(o1,o2) ->(o1<o2)? -1:(o1>o2)? 1:0;
		Collections.sort(list, c);
		System.out.println(list);
		
		

	}

}
