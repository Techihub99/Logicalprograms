package com.org.java.predifinedjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<Student>();
		 list.add(new Student(11, "suresh", 15, "amarvathi", 8));
			list.add(new Student(1, "abhi", 25, "wgrl", 12));
			list.add(new Student(10, "abhi", 18, "wgrl", 9));
			list.add(new Student(101, "suresh", 19, "wgrl", 11));
			list.add(new Student(141, "sabhi", 30, "wgrl", 15));
			list.add(new Student(111, "srinuchowdary", 9, "wgrl", 4));
			
			
			Predicate<Student> p1= k->k.getAge()>=18 && k.getAddress().equals("wgrl");
			Predicate<Student> p2=o1->o1.getStudentName().equals(o1.getStudentName());
			for(Student st:list){
				if(p1.test(st)){
					System.out.println(st);
				}
			}
			
			/*for (Student student : list) {
				if(p2.test(student)){
					//System.out.println(student);
				}
			}*/
			//System.out.println(p1.test(k));
		
		
		/*Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(10));//true
		System.out.println(p.test(25));//false
*/		
	}

}
