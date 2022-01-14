package com.company.doors;

public abstract class Door {
	String shape;
	String color;

	public Door(String shape, String color) {
		System.out.println("door constructor");
		this.shape = shape;
		this.color = color;
	}

	public abstract void openDoor();
	public abstract void closeDoor();
	public String getColor() {
		return color;
	}
}
