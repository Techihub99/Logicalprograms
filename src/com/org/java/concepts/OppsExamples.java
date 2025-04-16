package com.org.java.concepts;

class Parent{
	public Number m1()
	{
		System.out.println("parent m1 method");
		return null;
	}
	public void m2()
	{
		System.out.println("parent m2 method");
	}
}
class Child extends Parent{
	public Integer m1(){
		System.out.println("child m1 method");
		return null;
	}
	public void m3(){
		System.out.println("child m3 method");
	}
}
public class OppsExamples {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.m1();//parent m1 method
		p.m2();//parent m2 method
		Child c=new Child();
		c.m1();//child m1 method
		c.m2();//parent m2 method
		c.m3();//child m3 method
		Parent p1=new Child();
		p1.m1();//child m1 method
		p1.m2();//parent m2 method
		

	}

}
