package com.org.java.predifinedjava8;

import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x={0,5,10,15,20,25,30,35,40};
		Predicate<Integer> p1=i->i%2==0;
		System.out.println(p1.test(x.length));
		Predicate<Integer> p2=i->i>10;
		for(int i:x)
		{
			if(p1.and(p2).test(i)){
				System.out.println(i);//20,30 after applying both conditions 
			}
			if(p1.or(p2).test(i)){
				System.out.println(i);//0,10,15,20,25,30,35 even either greterthen 10 here 5 missing
			}
			if(p1.negate().test(i)){
				System.out.println(i);//5,15,25,35
			}
		}
	}

}
