package com.org.java.concepts;
class ParentNew{
	public void sum(int i) {
		System.out.println("parent class method sum::"+i*i);
	}
	public Object mul(String  i) {
		System.out.println("parent class method mul::"+i+i);
		return i;
	
	}	
	public Number sub(Float number) {
		System.out.println("parent number::"+number);
		return number;
		
	}
	public static void test() {
		System.out.println("parent test method:::");
	}
}
class ChildNew extends ParentNew{
	public void sum(int i) {
		System.out.println("child class method sum::"+i*i);
	}
	public StringBuffer mul(StringBuffer  i) {
		System.out.println("child class method mul::"+i+i);
		return i;
}
	public final Number sub(Float number) {
		System.out.println("child number::"+number);
		return number;
		
	}
	public static void test() {
		System.out.println("child test method:::");
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		ParentNew p=new ParentNew();
	p.sum(20);//parent class method sum::400
	ChildNew c=new ChildNew();
	c.sum(10);//child class method sum::100
	ParentNew p2=new ChildNew();
	p2.sum(15);//child class method sum::225
	p2.mul(null);
	p2.sub(10.20f);
	p2.test();
	//Child c2=new Parent();parent class object cannot hold in child class reference. 
	

	}

}
