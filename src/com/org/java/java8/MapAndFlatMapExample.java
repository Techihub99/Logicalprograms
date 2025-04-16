package com.org.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(102, "bnaresh", 35, 55000.0, 967691908, "java"));
		list.add(new Employee(100, "ajay", 40, 55000.0, 994865235, "sap"));
		list.add(new Employee(106, "srinu", 36, 45000.0, 895462220, ".net"));
		list.add(new Employee(104, "yyr", 42, 95000.0, 782622220, "testing"));
		list.add(new Employee(101, "ajay", 39, 105000.0, 970584628, "aws"));
		List<Long> mobbiles=list.stream().map(s1->s1.getMobbile()).collect(Collectors.toList());
		System.out.println(mobbiles);
	}

}
