package com.org.java.concepts;
class Parent1
{
	String name="srinu";
}
class Child1 extends Parent1{
	String name="sreenivasarao";
	public void test() {
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
}

public class SuperThisExample {

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.test();
	}
	}
