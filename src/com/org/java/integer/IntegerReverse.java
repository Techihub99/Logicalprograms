package com.org.java.integer;

public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number=545;
		long temp=number;
		long reverse=0;
		
		while(number!=0){
			reverse=reverse*10;
			reverse=reverse+number%10;
			number=number/10;
		}
System.out.println("Integer revese numbe is::"+reverse);

if(temp==reverse) {
	System.out.println("Is Pridrome Number");
}
else {
	System.out.println("is not pildrome number");
}
	}

}

