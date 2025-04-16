package com.org.java.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		set.add(new Employee(205, "suri", 38, 65898, "TL"));
		set.add(new Employee(208, "naveen", 35, 32568, "MANAGER"));
		set.add(new Employee(200, "shafi", 36, 24785, "PA"));
		set.add(new Employee(201, "apparao", 329, 48752, "ASSCOIATE"));
		set.add(new Employee(206, "naresh", 31, 45896, "TL"));
		System.out.println(set);
		
		
		Set<Employee> set2 = new LinkedHashSet<>();
		set2.add(new Employee(205, "suri", 38, 65898, "TL"));
		set2.add(new Employee(208, "naveen", 35, 32568, "MANAGER"));
		set2.add(new Employee(200, "shafi", 36, 24785, "PA"));
		set2.add(new Employee(201, "apparao", 36, 48752, "ASSCOIATE"));
		set2.add(new Employee(205, "suri", 38, 65898, "TL"));
		System.out.println(set2);
		Set<Employee> setADD = new LinkedHashSet<>();
		setADD.addAll(set);
		setADD.addAll(set2);
		System.out.println("new added to set::"+setADD);
		
		
		Set set3 = new TreeSet();
		set3.add("suri");
		set3.add("ggf");
		set3.add("ggf");
		
		
		
		/*
		 * set21.add(new Employee(205, "suri", 38, 65898, "TL")); set21.add(new
		 * Employee(208, "naveen", 35, 32568, "MANAGER")); set21.add(new Employee(200,
		 * "shafi", 36, 24785, "PA")); set21.add(new Employee(201, "apparao", 329,
		 * 48752, "ASSCOIATE")); set21.add(new Employee(206, "naresh", 31, 45896,
		 * "TL"));
		 */
		System.out.println(set3);
	}

}
