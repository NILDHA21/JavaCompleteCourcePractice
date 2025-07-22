package com.example.challange84;

public abstract class Bird implements Flyable {

	private final String breed;

	public Bird(String breed) {
		super();
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}
}
 