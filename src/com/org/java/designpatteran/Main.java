package com.org.java.designpatteran;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryNotification fn=new FactoryNotification();
	Notification note=fn.getNotification("msg");
	note.notification();
		
		
		
    
	}

}
