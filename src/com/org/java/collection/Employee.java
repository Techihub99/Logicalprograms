package com.org.java.collection;

import java.util.Objects;

public class Employee {
	
	private int empId;
	private String empName;
	private int age;
	private double salary;
	private String disignation;
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public Employee(int empId, String empName, int age, double salary, String disignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		this.disignation = disignation;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDisignation() {
		return disignation;
	}
	public void setDisignation(String disignation) {
		this.disignation = disignation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary
				+ ", disignation=" + disignation + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, disignation, empId, empName, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(disignation, other.disignation) && empId == other.empId
				&& Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	

}
