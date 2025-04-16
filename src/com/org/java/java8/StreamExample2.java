package com.org.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("aa");
		list.add("a");
		list.add("AAAA");
		list.add("AAAAA");
		list.add("AA");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		

	}

}
