package com.org.java.designpatteran;
class Singleton{
	private static Singleton instance;
	private Singleton() {
		
	}
	public static Singleton instance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
}
public class SingletonExample2 {

	public static void main(String[] args) {
		Singleton instance1=Singleton.instance();
		Singleton instance2=Singleton.instance();
		if(instance1==instance2) {
			System.out.println("BOTH INSTANCES ARE SAME...");
		}
		

	}

}
