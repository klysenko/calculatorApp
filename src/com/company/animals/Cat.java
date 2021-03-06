package com.company.animals;

import com.company.annotations.AccessToRestrictedBox;

@AccessToRestrictedBox
public class Cat extends Animal{

	public Cat(String name, int weight, String type) {
		super(name, weight, type);
	}

	@Override
	public void makeSound() {

	}

	@Override
	public void eat() {
		System.out.println("Cat eats");
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleeps");
	}
}
