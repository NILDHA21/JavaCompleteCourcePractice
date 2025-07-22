package com.example.shape83;

public class TestShapes {

	public static void main(String[] args) {
		//Shape shape = new Shape();
		Circle circle = new Circle(5);
		System.out.printf("The area for circle is %.3f sqcms.", circle.calculateArea());
		System.out.println();
		Square square = new Square(5);
		System.out.printf("The area for square is %.2f sqcms.", square.calculateArea());
	}
}
