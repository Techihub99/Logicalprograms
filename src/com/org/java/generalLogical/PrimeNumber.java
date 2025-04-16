package com.org.java.generalLogical;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=39;
		int temp;
		boolean isPrime=true;
		for(int i=2;i<=number/2;i++){
			temp=number%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
			if(!isPrime)
				System.out.println("is prime" +number);
				else{
				System.out.println("not prime numbr"+number);
			}

	}
	}

