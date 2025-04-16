package com.org.java.java8;

import java.util.stream.Stream;

public class ConcatTwoStrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> s1=Stream.of(1,2,3);
		Stream<Integer> s2=Stream.of(4,5,6);
		Stream.concat(s1, s2).forEach(System.out::println);

	}

}
