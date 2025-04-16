package com.org.java.generalLogical;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String otp="";
		for(int i=0;i<6;i++) {
			otp=otp+(int)(Math.random()*10);
		}
		System.out.println(otp);

	}

}
