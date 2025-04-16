package com.org.java.integer;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingNumberIntegerArrayExample {

	public static void main(String[] args) {
		
		int []itr= {1,2,4,6,7};
	Set<Integer> set1=Arrays.stream(itr).boxed().collect(Collectors.toSet());
	
		for(int j=0;j<=itr.length;j++) {
			if(!set1.contains(j)) {
				System.out.println(j);
			}
			
		}

	}

}
