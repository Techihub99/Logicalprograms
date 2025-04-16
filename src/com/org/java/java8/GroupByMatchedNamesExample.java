package com.org.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupByMatchedNamesExample {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(102, "bnaresh", 35, 55000.0, 967691908, "java"));
		list.add(new Employee(100, "ajay", 40, 55000.0, 994865235, "sap"));
		list.add(new Employee(106, "srinu", 36, 45000.0, 895462220, ".net"));
		list.add(new Employee(104, "yyr", 42, 95000.0, 782622220, "testing"));
		list.add(new Employee(101, "ajay", 39, 105000.0, 970584628, "aws"));
	Map<String, List<Employee>> groupNames=list.stream().collect(Collectors.groupingBy(Employee::getEmpName,TreeMap::new,Collectors.toList()));
	System.out.println(groupNames);
	}

}
