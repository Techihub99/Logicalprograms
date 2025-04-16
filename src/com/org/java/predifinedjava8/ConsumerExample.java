package com.org.java.predifinedjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		 list.add(new Student(11, "suresh", 15, "amarvathi", 8));
			list.add(new Student(1, "abhi", 25, "wgrl", 12));
			list.add(new Student(10, "abhi", 18, "ngda", 9));
			list.add(new Student(101, "suresh", 19, "wgrl", 11));
			list.add(new Student(141, "sabhi", 30, "hyd", 15));
			list.add(new Student(111, "srinuchowdary", 9, "vzd", 4));
			
			Consumer<Student> c=s1 ->System.out.println(s1);
			for (Student student : list) {
				c.accept(student);
			}
			
			
}
}