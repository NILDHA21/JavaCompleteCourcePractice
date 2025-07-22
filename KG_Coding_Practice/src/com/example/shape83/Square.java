package com.example.shape83;

public class Square extends Shape {

	private double sideInCms;
	
	public Square(double sideInCms) {
		this.sideInCms = sideInCms;
	}
	
	public double getSideInCms() {
		return sideInCms;
	}
	
	@Override
	public double calculateArea() {
		return sideInCms * sideInCms;
		//return Math.pow(sideInCms, 2);
	}
}
