package com.example.shape83;

public class Circle extends Shape {
	
	private double radiousInCms;
	
	public Circle(double radiousInCms) {
		this.radiousInCms = radiousInCms;
	}
	
	public double getRadiousInCms() {
		return radiousInCms;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radiousInCms, 2);
	}
}
