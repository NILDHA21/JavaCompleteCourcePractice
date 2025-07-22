package com.example.challange79;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Nilesh", 35, 70000);
		System.out.println(emp.getEmployeeDetails());
		emp.setSalary(75000);
		System.out.println(emp.getEmployeeDetails());
	}
}
