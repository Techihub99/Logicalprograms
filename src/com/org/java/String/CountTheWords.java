package com.org.java.String;

import java.util.Scanner;

class CountTheWords
{
    public static void main(String[] args)
    {
        System.out.println("Enter the string");
 
        Scanner sc = new Scanner(System.in);
 
        String s=sc.nextLine();
 
        String[] words = s.trim().split(" ");
 
        System.out.println("Number of words in the string = "+words.length);
        
        
        
        
        String str="welcome to java springboot and microservice development";
       String[]str11=str.trim().split(" ");
       int l=str11.length;
       System.out.println(l);
       
       
       String count=str.replace(" ", "");
       System.out.println(count.length());
        
    }
}
