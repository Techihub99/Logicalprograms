package com.org.java.predifinedjava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatoStringExample {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("srinu");
		list.add("amar");
		list.add("ajay");
		list.add("bsrinu");
		list.add("nsrinu");
		list.add("ksrinu");
		list.add("dsrinu");
		list.add("rajee");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Comparator<String> c=(o1,o2)->o2.compareTo(o1);
		Collections.sort(list, c);
		System.out.println(list);

	}

}
