package com.org.java.concepts;

class ModifierParent{
	static void m1(){
		System.out.println("parent");
	}
}
class ModifierChild extends ModifierParent{
	static void m1(){
		System.out.println("child");
	}
}
public class ModifiersExample {

	public static void main(String[] args) {
		ModifierParent p=new ModifierParent();
		p.m1();
		ModifierChild mc=new ModifierChild();
		mc.m1();
		ModifierParent c=new ModifierChild();
		c.m1();
	}

}
