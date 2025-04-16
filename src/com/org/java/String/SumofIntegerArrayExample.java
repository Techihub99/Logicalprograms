package com.org.java.String;

import java.util.Arrays;

public class SumofIntegerArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] itr = {1,5,5,7,6,4,8,46,45,41,5};
		
		for(int i:itr) {
			sum=sum+i;
			//sum+=itr[i];
		}
		System.out.println("Array of integer sum is:"+sum);
		
		int sumofArray=Arrays.stream(itr).sum();
	    System.out.println(sumofArray);
	}
	

}
