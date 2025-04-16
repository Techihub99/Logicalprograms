package com.org.java.predifinedjava8;

public class Student {
	public int studentId;
	public String studentName;
	private int age;
	private String address;
	private int study;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStudy() {
		return study;
	}
	public void setStudy(int study) {
		this.study = study;
	}
	public Student(int studentId, String studentName, int age, String address, int study) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.address = address;
		this.study = study;
	}
	public Student(Integer sid, String sname) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", address="
				+ address + ", study=" + study + "]";
	}
}
