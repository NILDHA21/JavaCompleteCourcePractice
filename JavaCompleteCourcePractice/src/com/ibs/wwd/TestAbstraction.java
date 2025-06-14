package com.ibs.wwd;

public class TestAbstraction {

	public static void main(String[] args) {
		//Vehicle veh = new Vehicle(0);
		Car car = new Car();
		car.commute();
		car.makeStartSound();
	}
}
