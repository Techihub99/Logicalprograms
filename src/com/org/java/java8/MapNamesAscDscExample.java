package com.org.java.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class MapNamesAscDscExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(102, "bnaresh", 35, 55000.0, 967691908, "java"));
		list.add(new Employee(100, "ajay", 40, 55000.0, 994865235, "sap"));
		list.add(new Employee(106, "srinu", 36, 45000.0, 895462220, ".net"));
		list.add(new Employee(104, "yyr", 42, 95000.0, 782622220, "testing"));
		list.add(new Employee(101, "ajay", 39, 105000.0, 970584628, "aws"));
		List<String> ascmapNames=list.stream().map(s1->s1.getEmpName()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(ascmapNames);
		List<String> dscmapNames=list.stream().map(s1->s1.getEmpName()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(dscmapNames);
	}

}
