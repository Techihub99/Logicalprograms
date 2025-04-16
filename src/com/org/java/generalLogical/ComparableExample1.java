package com.org.java.generalLogical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparableExample1 {

	public static void main(String[] args) {
	
		ArrayList<Student>list=new ArrayList<Student>();
		list.add(new Student(1, "srinu", 30, "khammam", 1));
		list.add(new Student(2, "naresh", 25, "hyderabad", 8));
		list.add(new Student(3, "suresh", 28, "delhi", 7));
		list.add(new Student(4, "ajay", 27, "pune", 5));
		list.add(new Student(5, "naveen", 34, "khammam", 4));
		Collections.sort(list);
		for (Student student : list) {
			System.out.println(student.getAge()+" "+student.getStudentId()+" "+student.getStudentName());
		}
	
	}

}
