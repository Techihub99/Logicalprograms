package com.org.java.concepts;

public class ThrowKeywordExample {

	public void ageCaluculation(int age) throws InvaildAgeException {
		if(age<18) {
			throw new InvaildAgeException("please after 18 we can apply");
		}else {
			System.out.println("plase welcome to vote");
		}
		
	}
	
	public static void main(String[] args) throws InvaildAgeException {
		// TODO Auto-generated method stub
		ThrowKeywordExample kwd=new ThrowKeywordExample();
		kwd.ageCaluculation(17);

	}

}
