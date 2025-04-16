package com.org.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JoinningExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Student> list=new ArrayList<Student>();
		 list.add(new Student(110, "suresh", 26, "amarvathi", 8));
			list.add(new Student(14, "naresh", 35, "hyd", 12));
			list.add(new Student(125, "suresh", 42, "ngda", 9));
			list.add(new Student(101, "paramesh", 26, "medak", 11));
			list.add(new Student(18, "naresh", 18, "hyd", 15));
			list.add(new Student(111, "asrinuchowdary", 24, "zvzd", 8));
		
		List<String> allNames=list.stream().map(i->i.getStudentName()).collect(Collectors.toList());
		System.out.println("All Student names In a List"+allNames);

		String Names=allNames.stream().map(i->i.toUpperCase()).collect(Collectors.joining(","  ));

		System.out.println("Joinning Names::"+Names);

	}

}
