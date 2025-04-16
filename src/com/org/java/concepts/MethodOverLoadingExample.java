package com.org.java.concepts;
class OverLoadingExample
{
	public void search(int id) {
		System.out.println("to get id::"+id);
		
	}
	public void search(float f) {
		System.out.println("to get id float::"+f);
		
	}
	public void search(Object name) {
		System.out.println("to get data byname using object:::"+name);
		
	}
	public void search(String name) {
		System.out.println("to get data byname using string:::"+name);
		
	}
	public void search() {}
}
/*
 * @GetMapping("/getId/id") public ResponseEntity<Employee>
 * search(@pathVarible("id") int id){
 * 
 * }
 * 
 * @GetMapping("/getId/name") public ResponseEntity<Employee>
 * search(@pathVarible("name") String name){
 * 
 * }
 */






public class MethodOverLoadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingExample ex=new OverLoadingExample();
		ex.search(10);
		ex.search(null);
		ex.search(15.5);

	}

}
