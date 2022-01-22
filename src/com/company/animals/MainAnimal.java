package com.company.animals;

public class MainAnimal {

	public static void main(String[] args){
		Cat cat = new Cat("Cat1", 4, "pet");
		Cat oneMoreCat = new Cat("Cat2", 5, "pet");
		Horse horse = new Horse("Horse1", 450, "wild");

		PetWalker petWalker = new PetWalker();

		Animal [] animals = {cat, horse, oneMoreCat};

		for (Animal animal: animals) {
			petWalker.walk(animal);
		}

	}
}
