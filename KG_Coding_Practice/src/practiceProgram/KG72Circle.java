package practiceProgram;

import java.util.Scanner;

//72. Calculate the area and circumference of a circle for a given radius using Math.PI

public class KG72Circle {
	
	double radiusInMm;
	
	KG72Circle(double radiusInMm) { // constructor
		this.radiusInMm = radiusInMm;
	}

	double getCircumference() { //Circumference
		return 2*radiusInMm*Math.PI;
	}
	
	double getArea() { //Area
		return Math.PI*Math.pow(radiusInMm, 2);
	}
	
	@Override
	public String toString() { //toString
		return "Circle Details: Radius in mm: "+radiusInMm
				+", Circumference in mm: "+getCircumference()
				+", Area in mm: "+getArea();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Circle world.");
		System.out.print("Please enter the radius: ");
		double radius = sc.nextDouble();
		KG72Circle circle = new KG72Circle(radius);
		System.out.println(circle);
		sc.close();
	}

}
