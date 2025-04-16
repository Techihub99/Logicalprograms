package com.org.java.concepts;

class TestParent
{
	public Number m1(){
		System.out.println("hello parent");
		return 10;
	}
}
class TestChild extends TestParent{
	public Number  m1(){
	System.out.println("child m1 method");
	return 1;
	
	}
	public StringBuffer m2(){
		System.out.println("child m2 method");
		return null;
		
	}
}
public class RulesofOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestParent p=new TestParent();
		p.m1();//hello parent
		TestChild c=new TestChild();
		c.m1();//child m1 method
		c.m2();//child m2 method
		TestParent p1=new TestChild();
		p1.m1();//child m1 method
		

	}

}
