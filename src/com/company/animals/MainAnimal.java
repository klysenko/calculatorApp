package com.company.animals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainAnimal {

	public static void main(String[] args){
		Cat cat = new Cat("Cat1", 4, "pet");
		Cat oneMoreCat = new Cat("Cat2", 5, "pet");
		Horse horse = new Horse("Horse1", 450, "wild");

		PetWalker petWalker = new PetWalker();

		List<Animal> animals = Arrays.asList(cat, oneMoreCat, horse);
		List<Cat> cats = Arrays.asList(cat, oneMoreCat);
		List<Horse> horses = Arrays.asList(horse);

		for (Animal animal: animals) {
			petWalker.walk(animal);
		}
		PetWalker.checkAnimals(cats);

	}
}
