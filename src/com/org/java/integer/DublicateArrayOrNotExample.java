package com.org.java.integer;

import java.util.Arrays;

public class DublicateArrayOrNotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []itr= {1,5,2,3,6,78};
		
		if(Arrays.stream(itr).distinct().count()!=itr.length) {
			System.out.println("dublicates are prasented..");
		}
		else {
			System.out.println("dublicates are not presented..");
		}
		

	}

}
