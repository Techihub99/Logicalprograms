package com.org.java.concepts;

public class AllExceptionExmples {

	private int x=10;
	private int y=0;
	String s=null;
	String s2="srinu";
	public void m1() {
		try {
			//System.out.println(x/y);
			int []a=new int[5];
			
			System.out.println(a[4]);
		}
		catch(ArithmeticException e) {
			System.out.println("division by zero problem plese re check");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please check the array size");
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
	}
	public void m2() {
		try {
			//System.out.println(s.length());
			int i=Integer.parseInt(s2);
		}
		catch(NullPointerException n) {
			System.out.println("it is a null value please check once");
			n.printStackTrace();
		}
		catch(NumberFormatException n) {
			System.out.println("cannot be convert String to int");
			//n.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		AllExceptionExmples ex=new AllExceptionExmples();
		ex.m1();
		ex.m2();

}
}