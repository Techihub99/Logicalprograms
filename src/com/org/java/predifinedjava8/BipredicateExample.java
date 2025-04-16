package com.org.java.predifinedjava8;

import java.util.function.BiPredicate;

public class BipredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer> bi=(a,b)->(a+b)%2==0;
		System.out.println(bi.test(25, 51));//true

	}

}
