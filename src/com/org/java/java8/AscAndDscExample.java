package com.org.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AscAndDscExample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(10);
		list.add(9);
		list.add(7);
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(25);
		list.add(21);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		List set=new ArrayList<>();
		set.add("B");
		set.add("A");
		set.add("B");
		set.add("D");
		set.add("K");
		set.add("B");
		set.add("Y");
		set.add("T");
		System.out.println(set);
		Collections.sort(set);
		System.out.println(set);
		Collections.reverse(set);
		System.out.println(set);	

	}

}
