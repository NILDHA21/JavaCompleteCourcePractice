package com.example.challange85;

//85. In a class Calculator, create multiple add() methods that overload each other and can sum two integers, three integers, or two doubles. Demonstrate how each can be called with different numbers of parameters.

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public double add(double a, double b) {
		 return a + b;
	}
	
	public static void main(String[] args) {
		Calculator sum = new Calculator();
		System.out.println(sum.add(5, 10) + "\n");
		System.out.println(sum.add(5, 10, 15) + "\n");
		System.out.println(sum.add(5, 20) + "\n");
	}
}
