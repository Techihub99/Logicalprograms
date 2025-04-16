package com.org.java.concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurentModificationException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("srinu");
		list.add("naresh");
		list.add("suresh");
		list.add("prakash");
		list.add("rajee");
		for(String str:list) {
			if(str.equals("srinu")) {
				list.add(str);
			}
		}  // to get currentmodification Exception
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals("srinu")) {
				list.remove(list.get(i));
			}
			
		}
		System.out.println(list);//[naresh, suresh, prakash, rajee]
		// This solution of avoiding currentmodification Exception
       }
	}


