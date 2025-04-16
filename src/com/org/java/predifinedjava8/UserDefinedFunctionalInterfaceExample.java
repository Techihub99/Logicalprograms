package com.org.java.predifinedjava8;

import java.util.function.Function;

interface UserDefine{
	public void sum(int x,int y);
	//public void length(String s);
}

public class UserDefinedFunctionalInterfaceExample {

	public static void main(String[] args) {
		UserDefine f=(x,y)->System.out.println(x+y);
		f.sum(20, 40);
		//UserDefine f=(s)->System.out.println(s.length());
		//f.length("sreenivasarao");
		
	}

}

