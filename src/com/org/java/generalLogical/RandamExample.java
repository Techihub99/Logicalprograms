package com.org.java.generalLogical;
import java.util.Random;

public class RandamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		for(int i=0;i<=5;i++){
			System.out.println(r.nextInt(100
					));
		}
	}

}
