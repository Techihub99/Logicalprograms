package com.org.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParticularRecordsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(102, "bnaresh", 35, 65000.0, 967691908, "java"));
		list.add(new Employee(100, "ajay", 40, 55000.0, 994865235, "sap"));
		list.add(new Employee(105, "srinu", 36, 45000.0, 895462220, ".net"));
		list.add(new Employee(107, "yyr", 42, 95000.0, 782622220, "testing"));
		list.add(new Employee(101, "zramesh", 39, 105000.0, 970584628, "aws"));
        System.out.println(list);
		List<Employee> paticularrecord = list.stream().skip(1).limit(2).collect(Collectors.toList());
		System.out.println(paticularrecord);
		//==============================================================================================================
		List<Employee> sort1 = list.stream()
				.sorted((s1, s2) -> s1.getEmpId() < s2.getEmpId() ? -1 : s1.getEmpId() > s2.getEmpId() ? 1 : 0).skip(1).limit(2)
				.collect(Collectors.toList());
		System.out.println(sort1);
//========================================================================================================================
	
                
	}

}
