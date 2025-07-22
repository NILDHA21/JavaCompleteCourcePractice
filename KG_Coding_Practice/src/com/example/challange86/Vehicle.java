package com.example.challange86;

/*86. Define a base class Vehicle with a method service() and a subclass Car that 
 * overrides service(). In Car's service(), provide a specific implementation that 
 * calls super.service() as well, to show how overriding works.*/

public class Vehicle {
	
	public void service() {
		System.out.println("Vehicle is getting serviced.");
	}
}
