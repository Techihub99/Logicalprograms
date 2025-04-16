package com.org.java.String;

public class StringRotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orignalString="DECODE";
		int rotationCharacters=2;
		
		System.out.println(leftRotaion(orignalString,rotationCharacters));
		System.out.println(rightRotation(orignalString,rotationCharacters));
	}
		private static String leftRotaion(String orignalString,int r){//CODEDE
			String rotationString=orignalString.substring(r)+orignalString.substring(0,r);
			return rotationString;
			
		}
		private static String rightRotation(String orignalString,int rotationCharacters){
			int partision=orignalString.length()-rotationCharacters;
			
			String rotation=orignalString.substring(partision)+orignalString.substring(0,partision);//DEDECODE
					return rotation;
		}

}
