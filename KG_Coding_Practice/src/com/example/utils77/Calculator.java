package com.example.utils77;
import com.example.geometry77.Circle;
import com.example.geometry77.Rectangle;

public class Calculator {
	public static void main(String[] args) {
		Circle cir = new Circle(5.5);
		Rectangle rec = new Rectangle(10, 5);
		
		double cirArea = Math.PI * Math.pow(cir.radious, 2);
		double recArea = rec.length * rec.breadth;
		
		System.out.printf("Area of Circle is %.2f and area of Rectangle is %.2f", cirArea, recArea);
	}
}
