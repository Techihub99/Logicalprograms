package com.org.java.generalLogical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(15);
		list.add(5);
		list.add(58);
		list.add(5);
		list.add(15);
		list.add(1);
		list.add(9);
		list.add(1);
		//System.out.println(list);
		List<Integer> value=list.stream().distinct().collect(Collectors.toList());
		System.out.println(value);
		Set<Integer> set=new HashSet<Integer>();
		Set<Integer> value2=list.stream().filter(i->!set.add(i)).collect(Collectors.toSet());
		//System.out.println(value2);
		//System.out.println(set);
		
		List<String> list2=new ArrayList<String>();
		list2.add("srinu");
		list2.add("ajay");
		list2.add("naveen");
		list2.add("harish");
		list2.add("srinu");
		
		List<String> nes=list2.stream().distinct().collect(Collectors.toList());
		System.out.println(nes);
		Set<String> s=new HashSet<String>();
		Set<String> newset=list2.stream().filter(i->!s.add(i)).collect(Collectors.toSet());
		System.out.println(newset);
		

	}

}
