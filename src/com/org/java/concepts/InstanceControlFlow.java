package com.org.java.concepts;

class InstanceControlFlow {
	 
    // initializing instance integer i = 10
    int i = 10;
 
    // first instance block
    {
        // call instance method (methodeOne())
        methodOne();
        System.out.println("First Instance Block");
    }
 
    // constructor
    InstanceControlFlow()
    {
        System.out.println("Constructor");
        methodOne();
    }
 
    // main method
    public static void main(String[] args)
    {
        // create InstanceControlFlow class object
       // InstanceControlFlow f = new InstanceControlFlow();
        System.out.println("Main method");
        
    }
 
    // instance method (methodOne())
    public void methodOne() {
    	System.out.println(j); }
 
    // second instance block
    {
        System.out.println("Second Instance Block");
    }
 
    // initializing instance integer j = 20
    int j = 20;
}