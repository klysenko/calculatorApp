package com.company.animals;

import java.util.List;

public class PetWalker {
	private Animal animal;

	public void walk(Animal animal) {
		System.out.println("I am walking with: " + animal);
	}

	public static void checkAnimals(List<? super Cat> animals) {

		for (int i = 0; i < animals.size(); i++) {
			System.out.println("checking: " + animals.get(i));
		}
	}
}
