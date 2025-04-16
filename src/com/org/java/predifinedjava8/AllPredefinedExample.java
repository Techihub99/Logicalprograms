package com.org.java.predifinedjava8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllPredefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itr=1;
		Predicate<Integer> p1=((s->s%2==0));
		Predicate<String> p2=s1->s1.equals("sreenivasarao");
		Predicate<Integer>p3=((s2->s2%2!=0));
		System.out.println(p1.test(itr));
		//===============================================================================================
		Supplier<Date> s1=()->new Date();
		System.out.println(s1.get());
		//===============================================================================================
		List<Student> list=new ArrayList<Student>();
		 list.add(new Student(11, "suresh", 15, "amarvathi", 8));
			list.add(new Student(1, "abhi", 25, "wgrl", 12));
			list.add(new Student(10, "abhi", 18, "ngda", 9));
			list.add(new Student(101, "suresh", 19, "wgrl", 11));
			list.add(new Student(141, "sabhi", 30, "hyd", 15));
			list.add(new Student(111, "srinuchowdary", 9, "vzd", 4));
			
			Consumer<Student> c=s3 ->System.out.println(s3);
			for (Student student : list) {
				c.accept(student);
			}
		//===================================================================================================
		

	}

}
