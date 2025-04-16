package com.org.java.java8Example;

public class Java8ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r=()->{
			for(int i=0;i<10;i++) {
				System.out.println("childThread");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		for(int j=0;j<10;j++) {
			System.out.println("main Thread");
		}

	}

}
