package com.org.java.integer;

import java.util.Arrays;

public class ComparingTwoArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []itr1= {1,2,3,4,5};
		int []itr2= {1,2,3,4,5};
		
		if(itr1==itr2) {
			System.out.println("Both arrays are equal...for == method");
		}
		else {
			System.out.println("Both arrays are not equal...== method");
		}
		
		if(Arrays.equals(itr1, itr2)) {
			System.out.println("Both arrays are equal...for equals method");
		}
		else {
			System.out.println("Both arrays are not equal...for equals method");
		}
	}

}
