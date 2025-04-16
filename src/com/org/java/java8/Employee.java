package com.org.java.java8;

import java.util.Objects;

public class Employee {
	
	private int empId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	@Override
	public int hashCode() {
		return Objects.hash(age, empId, empName, mobbile, platform, salary);
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
		return age == other.age && empId == other.empId && Objects.equals(empName, other.empName)
				&& mobbile == other.mobbile && Objects.equals(platform, other.platform)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	public Employee(int empId, String empName, int age, double salary, long mobbile, String platform) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		this.mobbile = mobbile;
		this.platform = platform;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary
				+ ", mobbile=" + mobbile + ", platform=" + platform + "]";
	}
	public long getMobbile() {
		return mobbile;
	}
	public void setMobbile(long mobbile) {
		this.mobbile = mobbile;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	private String empName;
	private int age;
	private double salary;
	private long mobbile;
	private String platform;
}
