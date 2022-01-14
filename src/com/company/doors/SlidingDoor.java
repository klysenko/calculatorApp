package com.company.doors;

public class RightDoor extends Door {

	public RightDoor(String shape, String color) {
		super(shape, color);
	}

	@Override
	public void openDoor() {
		System.out.println("open from right");
	}

	@Override
	public void closeDoor() {

	}
}
