package com.example.challange79;

public class Employee {
	private String name;
	private int age;
	private double salary;
	
	Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	String getEmployeeDetails() {
		return "Employee Details: Name: " + name + ", Age: " + age + ", Salary: " + salary;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	

}
