package com.example.challange84;

public class Eagle extends Bird {

	public Eagle(String breed) {
		super(breed);
	}

//	public Eagle() {
//		super("EagleBreed");
//	}

	@Override
	public void fly() {
		System.out.println("Eagle is flying.");
	}

}
