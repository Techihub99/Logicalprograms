package com.org.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Student> list=new ArrayList<Student>();
		 list.add(new Student(110, "suresh", 26, "amarvathi", 8));
			list.add(new Student(14, "naresh", 35, "hyd", 12));
			list.add(new Student(125, "suresh", 42, "ngda", 9));
			list.add(new Student(101, "paramesh", 26, "medak", 11));
			list.add(new Student(18, "naresh", 18, "hyd", 15));
			list.add(new Student(111, "asrinuchowdary", 24, "zvzd", 8));
			
	Map<Integer,List<Student>> student1=list.stream().collect(Collectors.groupingBy(emp->emp.getAge()));
	System.out.println("fst"+student1);	
	Map<Integer,Set<Student>> student2=list.stream().collect(Collectors.groupingBy(emp->emp.getAge(),Collectors.toSet()));
	System.out.println("2nd"+student2);
	Map<Integer,Set<Student>> student3=list.stream().collect(Collectors.groupingBy(emp->emp.getAge(),TreeMap::new,Collectors.toSet()));
	System.out.println(student3);

	}

}
