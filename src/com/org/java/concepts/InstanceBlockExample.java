package com.org.java.concepts;

public class InstanceBlockExample {
	{
		System.out.println("This is first instance block");
	}
	InstanceBlockExample(){
		System.out.println("this is constructer ");
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
		InstanceBlockExample test=new InstanceBlockExample();
		test.m1();
    System.out.println("this is main method");
    
	}
	
	{
		System.out.println("this is second static block");
	}
	public void m1() {
		System.out.println("this is m1 method");
	}

}
