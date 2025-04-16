package com.org.java.concepts;
interface A
{
	public void m1(); 
}
interface B extends A{
	public void m1();
	
}
 class C implements A,B{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MultpleInhertenceExample {

	public static void main(String[] args) {
		C b=new C();
		b.m1();

	}

}
