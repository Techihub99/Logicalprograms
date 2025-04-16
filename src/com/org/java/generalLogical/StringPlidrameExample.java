package com.org.java.generalLogical;

public class StringPlidrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbav";
		String rev="";
		int length=str.length();
		for ( int i = length - 1; i >= 0; i-- )
	         rev=rev+(str.charAt(i));
	System.out.print(rev);
		if(str.equals(rev)){
			System.out.println("is plidrame");
		}
		else{
			System.out.println("is not plidrame");
		}

	}

}
