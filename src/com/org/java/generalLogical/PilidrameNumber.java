package com.org.java.generalLogical;

public class PilidrameNumber {

	public static void main(String[] args) {
		int pnumber=2747472;
		int sum=0;
		int temp=pnumber;
		int r;{
		//temp=pnumber;
		while(pnumber>0){
			r=pnumber%10;
			sum=(sum*10)+r;
			pnumber=pnumber/10;
		}
		if(temp==sum)
			System.out.println("is pilidrome");
		else
			System.out.println("is not pilidrome");

		}

	}

}
