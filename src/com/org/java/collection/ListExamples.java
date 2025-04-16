
package com.org.java.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExamples {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "srinu", 35, 25000, "Associate"));
		list.add(new Employee(108, "mahesh", 27, 25500, "SrAssociate"));
		list.add(new Employee(105, "naresh", 35, 30000, "manager"));
		list.add(new Employee(100, "suresh", 45, 24000, "tl"));
		list.add(new Employee(108, "puresh", 43, 29000, "Associate"));
		System.out.println(list);
		Employee e = list.get(4);
		System.out.println(e);
		Class c = list.getClass();
		System.out.println(c);
		Employee r=	list.remove(1);
		System.out.println(r);
		System.out.println(list.size());
		list.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getEmpId()>o2.getEmpId()?-1:o1.getEmpId()<o2.getEmpId()?1:0;
			}
			
		});
		System.out.println(list);
	

	List<Employee> list2 = new LinkedList<>();
	list2.add(new Employee(101, "srinu", 35, 25000, "Associate"));
	list2.add(new Employee(108, "mahesh", 27, 25500, "SrAssociate"));
	list2.add(new Employee(105, "naresh", 35, 30000, "manager"));
	list2.add(new Employee(100, "suresh", 45, 24000, "tl"));
	list2.add(new Employee(108, "puresh", 43, 29000, "Associate"));
	System.out.println(list);
	Employee e2 = list2.get(4);
	System.out.println(e);
	Class c2 = list2.getClass();
	System.out.println(c);
	//Employee r=	list.remove(1);
	//System.out.println(r);
	System.out.println(list.size());
	list2.sort(new Comparator<Employee>() {

		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getEmpId()<o2.getEmpId()?-1:o1.getEmpId()>o2.getEmpId()?1:0;
		}
		
	});
	System.out.println(list2);

	List<Employee> list3 = new Vector<>();
	list3.add(new Employee(101, "srinu", 35, 25000, "Associate"));
	list3.add(new Employee(108, "mahesh", 27, 25500, "SrAssociate"));
	list3.add(new Employee(105, "naresh", 35, 30000, "manager"));
	list3.add(new Employee(100, "suresh", 45, 24000, "tl"));
	list3.add(new Employee(108, "puresh", 43, 29000, "Associate"));
	System.out.println(list);
	Employee e3 = list3.get(4);
	System.out.println(e);
	Class c3 = list3.getClass();
	System.out.println(c);
	//Employee r=	list.remove(1);
	//System.out.println(r);
	System.out.println(list.size());
	list3.sort(new Comparator<Employee>() {

		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getEmpId()<o2.getEmpId()?-1:o1.getEmpId()>o2.getEmpId()?1:0;
		}
		
	});
	System.out.println(list3);
}


}
