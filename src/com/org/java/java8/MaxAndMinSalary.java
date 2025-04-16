package com.org.java.java8;

import java.util.ArrayList;

public class MaxAndMinSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			ArrayList<Employee> list=new ArrayList<Employee>();
			list.add(new Employee(102, "bnaresh", 35, 65000.0, 967691908, "java"));
			list.add(new Employee(100, "ajay", 40, 55000.0, 994865235, "sap"));
			list.add(new Employee(105, "srinu", 36, 45000.0, 895462220, ".net"));
			list.add(new Employee(107, "yyr", 42, 95000.0, 782622220, "testing"));
			list.add(new Employee(101, "zramesh", 39, 105000.0, 970584628, "aws"));
			
			Employee maxSalary=list.stream().max((s1,s2)->s1.getSalary()<s2.getSalary() ?-1:s1.getSalary()>s2.getSalary()? 1:0).get();
			System.out.println(maxSalary);
			Employee minSalary=list.stream().min((s1,s2)->s1.getSalary()<s2.getSalary() ?-1:s1.getSalary()>s2.getSalary()? 1:0).get();
			System.out.println(minSalary);
			Double maxSalary1=list.stream().mapToDouble(x->x.getSalary()).summaryStatistics().getMax();
			System.out.println(maxSalary1);
			Double minSalary1=list.stream().mapToDouble(x->x.getSalary()).summaryStatistics().getMin();
			System.out.println(minSalary1);
			Double SumSalary=list.stream().mapToDouble(x->x.getSalary()).summaryStatistics().getSum();
			System.out.println(SumSalary);
			long counts=list.stream().mapToDouble(x->x.getSalary()).summaryStatistics().getCount();
			System.out.println(counts);
			Double avg=list.stream().mapToDouble(x->x.getSalary()).summaryStatistics().getAverage();
			System.out.println(avg);
			

		}	

}
