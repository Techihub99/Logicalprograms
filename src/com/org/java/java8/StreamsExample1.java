package com.org.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsExample1 {

	public static void main(String[] args) {
		
	 List<Student> list=new ArrayList<Student>();
	 list.add(new Student(11, "suresh", 15, "amarvathi", 8));
		list.add(new Student(1, "sabhi", 25, "wgrl", 12));
		list.add(new Student(10, "bstin", 18, "ngda", 9));
		list.add(new Student(101, "nsrinu", 19, "medak", 11));
		list.add(new Student(141, "asabhi", 10, "hyd", 15));
		list.add(new Student(111, "srinuchowdary", 9, "zvzd", 4));
		
		List<Student> l1=list.stream().filter(i->i.getAge()>=10).collect(Collectors.toList());
		List<Student> l2=list.stream().filter(i->i.getStudentName().startsWith("s")).collect(Collectors.toList());
		List<Student> l3=list.stream().filter(i->i.getStudentName().equals("abhi")).collect(Collectors.toList());
		List<Student> l4=list.stream().filter(i->i.getStudentName().length()<10).collect(Collectors.toList());
		List<Student> l5=list.stream().filter(i->i.getAge()%2==0).collect(Collectors.toList());
		List<Integer> l6=list.stream().map(i->i.getAge()*2).collect(Collectors.toList());
		List<Integer> l7=list.stream().map(i->i.getAge() +5).collect(Collectors.toList());
		
		List<Student> lnew=list.stream().sorted((s1,s2)->s1.getStudentId()<s2.getStudentId() ?-1:s1.getStudentId()>s2.getStudentId() ? 1:0).collect(Collectors.toList());
		
		List<Student> l8=list.stream().sorted((s1,s2)->-s1.getAddress().compareTo(s2.getAddress())).collect(Collectors.toList());
		List<Student> l9=list.stream().sorted((s1,s2)->-s1.getAddress().compareTo(s2.getAddress())).collect(Collectors.toList());
		Student l10=list.stream().max((k1,k2)->k1.getAge()<k2.getAge()?-1:k1.getAge()>k2.getAge()? 1:0).get();
		Student l11=list.stream().min((k1,k2)->k1.getAge()<k2.getAge()?-1:k1.getAge()>k2.getAge()? 1:0).get();
		Student lnew1=list.stream().max((s1,s2)->s2.getAddress().compareTo(s1.getAddress())).get();
		Student lnew2=list.stream().min((s1,s2)->s2.getAddress().compareTo(s1.getAddress())).get();
		//List<Student> l12=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).get(-1);
		//List<Student>=list.stream().forEach(System.out::println);
		
		System.out.println(l8); 
//System.out.println(lnew2);

	}

}
