package com.company.animals;

public class Horse extends Animal{

	public Horse(String name, int weight, String type) {
		super(name, weight, type);
	}

	@Override
	public void makeSound() {
		System.out.println("Horse make sound");
	}

	@Override
	public void eat() {
		System.out.println("Horse eats");
	}

	@Override
	public void sleep() {
		System.out.println("Horse sleep:");
	}

}
