package com.org.java.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
	Map<Integer,Employee> map=new HashMap<Integer,Employee>();
	map.put(null, new Employee(5, "srinu", 36, 30000, "Associate"));
	map.put(null, new Employee(6, "naresh", 31, 35000, "tl"));
	map.put(null, new Employee(7, "suri", 45, 41000, "manager"));
	map.put(null, new Employee(81, "abhi", 29, 44400, "pa"));
	map.put(null, new Employee(7, "suri", 45, 41000, "manager"));
	map.put(null, new Employee(8, "abhi", 29, 44400, "pa"));
	map.put(5, new Employee(9, "praveen", 33, 27850, "srAssociate"));
	//System.out.println(map);
	
	
	Map<Integer,Employee> map1=new LinkedHashMap<Integer,Employee>();
	map1.put(null, new Employee(5, "srinu", 36, 30000, "Associate"));
	map1.put(null, new Employee(6, "naresh", 31, 35000, "tl"));
	map1.put(null, new Employee(7, "suri", 45, 41000, "manager"));
	map1.put(null, new Employee(8, "abhi", 29, 44400, "pa"));
	map1.put(null, new Employee(9, "praveen", 33, 27850, "srAssociate"));
	//System.out.println(map1);
		
		Map<Integer,Employee> map11=new Hashtable<Integer,Employee>();
		map11.put(1, new Employee(5, null, 36, 30000, "Associate"));
		map11.put(2, new Employee(6, "naresh", 31, 35000, "tl"));
		map11.put(3, new Employee(7, "suri", 45, 41000, "manager"));
		map11.put(6, new Employee(8, "abhi", 29, 44400, "pa"));
		map11.put(5, new Employee(9, "praveen", 33, 27850, "srAssociate"));
		System.out.println(map11);
		
		List<Entry<Integer, Employee>> sortMap=map11.entrySet().stream().sorted((s1,s2)->s1.getValue().getSalary()<s2.getValue().getSalary() ?-1:s2.getValue().getSalary()>s1.getValue().getSalary()? 1:0).collect(Collectors.toList());
		System.out.println("test....."+sortMap);
		
		
		
		
		
	List<Entry<Integer, Employee>> test=map11.entrySet().stream().collect(Collectors.toList());
	List<Entry<Integer, Employee>> newValue=test.stream().sorted((s1,s2)->s1.getValue().getSalary()>s2.getValue().getSalary()?-1:s1.getValue().getSalary()<s2.getValue().getSalary()?1:0).collect(Collectors.toList());
	System.out.println(newValue);
	
		
		
		
		
	Map<Integer,Employee> treemap=new TreeMap<Integer,Employee>();
	treemap.put(1, new Employee(25, "abc", 85, 10, "x"));
	treemap.put(0,new Employee(15, "cde", 85, 8, "y"));
	treemap.put(5, new Employee(50, "fgh", 85, 7, "z"));
	treemap.put(3, new Employee(32, "klm", 85, 6, "a"));
	treemap.put(3, new Employee(32, "klm", 85, 6, "a"));
	//System.out.println(treemap);
	Map<Integer,Employee> mapadd=new LinkedHashMap<Integer,Employee>();
	mapadd.putAll(treemap);
	mapadd.putAll(map11);
	mapadd.putAll(map1);
	mapadd.putAll(map);
	//System.out.println(mapadd);
	
	}

}
