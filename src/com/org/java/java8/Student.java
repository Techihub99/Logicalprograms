package com.org.java.java8;

public class Student {
	private int studentId;
	private String studentName;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", address="
				+ address + ", study=" + study + "]";
	}
}
