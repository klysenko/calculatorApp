package com.company.animals;

public class SmallCat extends Cat{

	public SmallCat(String name, int weight, String type) {
		super(name, weight, type);
	}

	@Override
	public void eat() {
		System.out.println("Cat eats milk");
	}
}
