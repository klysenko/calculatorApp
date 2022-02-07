package com.company.annotations;

import java.util.List;

import com.company.animals.Animal;
import com.company.animals.Cat;
import com.company.animals.Horse;
import com.company.animals.SmallCat;

public class Main {

	public static void main(String[] args) {

		Animal cat = new Cat("myCat", 4, "tiger");
		Animal smallCat = new SmallCat("mySmallCat", 4, "tiger");
		Animal horse = new Horse("myHorse", 100, "ponny");
		Box restrictedBox = new RestrictedBox();
		restrictedBox.addToBox(cat);
		restrictedBox.addToBox(smallCat);
		List<Object> values = restrictedBox.values;
		System.out.println(values);

		BigBox bigBox = new BigBox();
		SmallBox smallBox = new SmallBox();

		for (int i = 0; i < 15; i++) {
			System.out.println("Adding to big box number " + i);
			bigBox.addToBox("a");
			System.out.println("Adding to small box number " + i);
			smallBox.addToBox("b");
		}

		System.out.println(bigBox.values);
		System.out.println(smallBox.values);
	}
}
