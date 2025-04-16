package com.org.java.concepts;


public class StaticControlFlowExample {
	
	static int x=100;
	static int j=200;
	
	static {
		m1();
		System.out.println("this is my first static block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println(x);
		System.out.println("this is main method");
	}
	public static void m1() {
		System.out.println(j);
	}
	static {
		System.out.println("This is my second static block");
	}
	

}//200 
