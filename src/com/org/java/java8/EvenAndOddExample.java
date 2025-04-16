package com.org.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EvenAndOddExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(102, "bnaresh", 35, 65000.0, 967691908, "java"));
		list.add(new Employee(100, "ajay", 40, 55000.0, 994865235, "sap"));
		list.add(new Employee(105, "srinu", 36, 45000.0, 895462220, ".net"));
		list.add(new Employee(107, "yyr", 42, 95000.0, 782622220, "testing"));
		list.add(new Employee(101, "zramesh", 39, 105000.0, 970584628, "aws"));
        System.out.println(list);
       List<Employee> evenList= list.stream().filter(s1->s1.getEmpId()%2==0).collect(Collectors.toList());
       System.out.println(evenList);
       
       List<Employee> oddList= list.stream().filter(s1->s1.getEmpId()%2!=0).collect(Collectors.toList());
       System.out.println(oddList);
     // List<Employee> empIds= list.stream().filter(s1->s1.getMobbile()).toString().startsWith("9").collect(Collectors.toList());
      //System.out.println(empIds);

	}

}
