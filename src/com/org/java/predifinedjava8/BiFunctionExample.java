package com.org.java.predifinedjava8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
public class BiFunctionExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<Student>();
		BiFunction<Integer, String, Student> bf=(studentId,studentName)->new Student(studentId,studentName);
		list.add(bf.apply(250, "suresh"));
		list.add(bf.apply(350, "naveen"));
		list.add(bf.apply(850, "rajee"));
		list.add(bf.apply(550, "mahesh"));
		list.add(bf.apply(50, "suresh"));
		for(Student s:list){
			System.out.println(s.studentId);
			System.out.println(s.studentName);
		}
	}
}
