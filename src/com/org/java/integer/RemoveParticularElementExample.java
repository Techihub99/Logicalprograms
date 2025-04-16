package com.org.java.integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveParticularElementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] itr = { 45, 85, 5, 6, 1, 5, 8 };
		List list2 = new ArrayList();
		List<Integer> list = Arrays.stream(itr).boxed().collect(Collectors.toList());
		System.out.println(list);
		
		
		
		boolean list22 = list.removeAll(list.stream().filter(s1 -> s1 == 8).toList());

		System.out.println(list);

	}

}
