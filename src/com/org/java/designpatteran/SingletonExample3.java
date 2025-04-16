package com.org.java.designpatteran;
class Singleton1{
	private static Singleton1 instance;
	private Singleton1() {
		
	}
	public static Singleton1 instance() {
		if(instance==null) {
			instance=new Singleton1();
		}
		return instance;
	}
}
public class SingletonExample3 {

	public static void main(String[] args) {
		Singleton1 instance1=Singleton1.instance();
		Singleton1 instance2=Singleton1.instance();
		if(instance1==instance2) {
			System.out.println("BOTH INSTANCES ARE SAME...");
		}
		

	}

}
