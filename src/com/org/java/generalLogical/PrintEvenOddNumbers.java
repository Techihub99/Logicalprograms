package com.org.java.generalLogical;

public class PrintEvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=11;
		if(number%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("oddd number");
		}
		
		
		for(int i=0;i<=10;i++)
		{
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
