package com.org.java.generalLogical;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l);
		
		List<Integer> lis=l.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(lis);

	}

}
