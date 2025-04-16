package com.org.java.java8Example;

@FunctionalInterface
interface functionTest {

	 String msgTest(String msg);

	 int hashCode();

	 String toString();

	 boolean equals(Object obj);

	 default void m1() {
		System.out.println("Default method in Functional interface");
	}

	 static void staticTest() {
		System.out.println("Static method in inside functional interface..");

	}
}

public class FunctionalInterfaceExample implements functionTest {

	@Override
	public String msgTest(String msg) {
		// TODO Auto-generated method stub
		return msg;
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample test = new FunctionalInterfaceExample();
		//test.m1();
		System.out.println(test.msgTest("welcome to java"));
		
	}
}

