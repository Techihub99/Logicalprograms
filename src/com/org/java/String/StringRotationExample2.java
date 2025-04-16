package com.org.java.String;

public class StringRotationExample2 {

	public static void main(String[] args) {
		
		String originalString="sreenivasarao";
		int rotateCharacters=4; //nivasaraosree
		int rotatechar=3;//raosreenivasa
System.out.println(leftRotation(originalString,rotateCharacters));
System.out.println(rightRotation(originalString,rotatechar));
		//nivasaraosree
		//raosreenivasa
	}
private static String leftRotation(String originalString,int r){
	String rotation=originalString.substring(r)+originalString.substring(0,r);
	return rotation;
}
private static String rightRotation(String originalString,int rotatechar){
	int partision=originalString.length()-rotatechar;
	String rotation=originalString.substring(partision)+originalString.substring(0,partision);
	return rotation;
}
	
}



