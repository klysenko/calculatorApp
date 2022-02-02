package com.company.doors;

public abstract class Door {
	private String shape;
	private String color;

	public Door(String shape, String color) {
		this.shape = shape;
		this.color = color;
	}

	public abstract void openDoor();
	public abstract void closeDoor();
	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Door{" +
				"shape='" + shape + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
