package com.org.java.predifinedjava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorObjectExample {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(11, "suresh", 15, "amarvathi", 8));
		list.add(new Student(1, "abhi", 25, "wgrl", 12));
		list.add(new Student(10, "bstin", 18, "ngda", 9));
		list.add(new Student(101, "nsrinu", 19, "medak", 11));
		list.add(new Student(141, "rajee", 30, "hyd", 15));
		list.add(new Student(111, "yadav", 9, "vzd", 5));
		System.out.println(list);
		/*Comparator<Student> c = (o1, o2) -> o1.getStudentId() < o2.getStudentId() ? -1
				: o1.getStudentId() > o2.getStudentId() ? 1 : 0;
		Collections.sort(list, c);
		System.out.println(list);*/
		/*Comparator<Student> c1=(o1,o2)->o2.getStudentName().compareTo(o1.getStudentName());
		Collections.sort(list, c1);
		System.out.println(list);*/
		/*Comparator<Student> c2=(o1,o2)->o1.getAddress().compareTo(o2.getAddress());
		Collections.sort(list, c2);
		System.out.println(list);*/
		Comparator<Student> c3=(o1,o2)->o1.getAge()>o2.getAge()?-1:o1.getAge()<o2.getAge()? 1:0;
		Collections.sort(list, c3);
		System.out.println(list);
		
	}

}
